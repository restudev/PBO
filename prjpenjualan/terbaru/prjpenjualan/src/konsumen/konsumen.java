/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package konsumen;

import java.sql.*;
import prjpenjualan.KoneksiMysql;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Restu
 */
public class konsumen {
    String kd_kons;
    String nm_kons;
    String alm_kons;
    String kota_kons;
    String kd_pos;
    String phone;
    String email;

    Connection Con;
    ResultSet RsKonsumen;
    Statement stm;

    Boolean ada = false;
    Boolean edit=false;
    String sql;

   public DefaultTableModel tabMode;
   private Object[][] dataTable = null;
   private String[] header = {"Kode","Nama Konsumen","Alamat","Kota","Kode Pos","Phone","Email"};

    public konsumen()
    {
    }
   public void insert(String kd_kons, String nm_kons, String alm_kons, String kota_kons, String kd_pos, String phone, String email){

        try {
            sql="insert into konsumen (kd_kons,nm_kons,alm_kons,kota_kons,kd_pos,phone,email) values (?,?,?,?,?,?,?)";
            PreparedStatement insert = Con.prepareStatement(sql);
            insert.setString(0, kd_kons);
            insert.setString(1, nm_kons);
            insert.setString(2, alm_kons);
            insert.setString(3, kota_kons);
            insert.setString(4, kd_pos);
            insert.setString(5, phone);
            insert.setString(6, email);

            insert.executeUpdate();
            insert.close();
            Con.close();
         } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void open_db()
{
         try{
	//	KoneksiMysql kon= new KoneksiMysql("penjualan");
		KoneksiMysql kon = new KoneksiMysql ("localhost","root","","penjualan");
		Con = kon.getConnection();
		//System.out.println("Berhasil ");
        }catch (Exception e) {
		System.out.println("Error : "+e);
		}
}

    public void delete(String kode)
    {
        try{
         sql="delete from konsumen where kd_kons='" + kode + "'";
        PreparedStatement delete = Con.prepareStatement(sql);
        delete.executeUpdate();
        }
        catch(Exception e) {
		System.out.println("Error : "+e);
		}

    }

    public void baca_data()
{
    try{
            stm = Con.createStatement();
            RsKonsumen = stm.executeQuery("select * from konsumen");
            
          //  tabMode=new DefaultTableModel(null,header);
            
            ResultSetMetaData meta = RsKonsumen.getMetaData();
            int col = meta.getColumnCount();            
            int baris = 0;
            while(RsKonsumen.next()) {
                baris = RsKonsumen.getRow();
            }
            
            dataTable = new Object[baris][col];
            int x = 0;
            RsKonsumen.beforeFirst();
            while(RsKonsumen.next()) {
                dataTable[x][0] = RsKonsumen.getString("kd_kons");
                dataTable[x][1] = RsKonsumen.getString("nm_kons");
                dataTable[x][2] = RsKonsumen.getString("alm_kons");
                dataTable[x][3] = RsKonsumen.getString("kota_kons");
                dataTable[x][4] = RsKonsumen.getString("kd_pos");
                dataTable[x][5] = RsKonsumen.getString("phone");
                dataTable[x][6] = RsKonsumen.getString("email");
                x++;
            }
         //   tblBrg.setModel(new DefaultTableModel(dataTable,header));        
            //    tabMode.addRow(dataTable);
            tabMode=new DefaultTableModel(dataTable,header);
    }
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}
}
