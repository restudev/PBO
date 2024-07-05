/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmKonsumen.java
 *
 * Created on 26 Nov 08, 22:11:45
 */

package com.restu.prjpenjualan;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import konsumen.*;

/**
 *
 * @author mrjj
 */
public class frmKonsumen extends javax.swing.JFrame {
    Boolean edit=false;
    
    
    /** Creates new form frmKonsumen */
    
    public frmKonsumen() {
        initComponents();
        konsumen kons=new konsumen();
        kons.open_db();
        kons.baca_data();
        tblKonsumen.setModel(kons.tabMode);
        aktif(false);
        setTombol(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKonsumen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKota = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtKd_pos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmdTambah = new javax.swing.JButton();
        cmdSimpan = new javax.swing.JButton();
        cmdKoreksi = new javax.swing.JButton();
        cmdHapus = new javax.swing.JButton();
        cmdBatal = new javax.swing.JButton();
        cmdKeluar = new javax.swing.JButton();
        txtAlm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Konsumen");

        tblKonsumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Konsumen", "Alamat", "Kota", "Kode Pos", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblKonsumen.setName("tblBarang"); // NOI18N
        tblKonsumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKonsumenMouseClicked(evt);
            }
        });
        tblKonsumen.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tblKonsumenCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tblKonsumen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblKonsumenPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblKonsumen);

        jLabel1.setText("Kode Konsumen"); // NOI18N

        jLabel2.setText("Nama Konsumen"); // NOI18N

        jLabel3.setText("Alamat"); // NOI18N

        jLabel4.setText("Kota"); // NOI18N

        jLabel5.setText("Kode Pos"); // NOI18N

        jLabel6.setText("Telepon"); // NOI18N

        txtKode.setName("txtkode"); // NOI18N
        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        txtNama.setName("txtnama"); // NOI18N

        txtKota.setName("txtKota"); // NOI18N

        txtPhone.setName("txtPhone"); // NOI18N

        txtKd_pos.setName("txtKd_pos"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Data Konsumen"); // NOI18N

        cmdTambah.setText("Tambah"); // NOI18N
        cmdTambah.setName("cmdTambah"); // NOI18N
        cmdTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTambahActionPerformed(evt);
            }
        });

        cmdSimpan.setText("Simpan"); // NOI18N
        cmdSimpan.setName("cmdSimpan"); // NOI18N
        cmdSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdSimpanMouseClicked(evt);
            }
        });
        cmdSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSimpanActionPerformed(evt);
            }
        });

        cmdKoreksi.setText("Koreksi");
        cmdKoreksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKoreksiActionPerformed(evt);
            }
        });

        cmdHapus.setText("Hapus");
        cmdHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHapusActionPerformed(evt);
            }
        });

        cmdBatal.setText("Batal"); // NOI18N
        cmdBatal.setName("cmdTambah"); // NOI18N
        cmdBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBatalActionPerformed(evt);
            }
        });

        cmdKeluar.setText("Keluar"); // NOI18N
        cmdKeluar.setName("cmdKeluar"); // NOI18N
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });

        txtAlm.setName("txtnama"); // NOI18N

        jLabel8.setText("Email"); // NOI18N

        txtEmail.setName("txtStokMin"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSimpan)
                        .addGap(5, 5, 5)
                        .addComponent(cmdKoreksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdKeluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKd_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtKota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                    .addComponent(txtAlm, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKd_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSimpan)
                    .addComponent(cmdTambah)
                    .addComponent(cmdKoreksi)
                    .addComponent(cmdBatal)
                    .addComponent(cmdKeluar)
                    .addComponent(cmdHapus))
                .addGap(72, 72, 72))
        );

        setSize(new java.awt.Dimension(533, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblKonsumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKonsumenMouseClicked
        //setField();
      //  konsumen k=new konsumen();
      //  k.baca_data();
}//GEN-LAST:event_tblKonsumenMouseClicked

    private void tblKonsumenCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblKonsumenCaretPositionChanged
        // TODO add your handling code here:
        //   txtKode.setText((String)tblBrg.getValueAt(tblBrg.getSelectedColumnCount(),tblBrg.getSelectedRowCount()));
}//GEN-LAST:event_tblKonsumenCaretPositionChanged

    private void tblKonsumenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblKonsumenPropertyChange
        // TODO add your handling code here:
        //txtNama.setText((String)tblKonsumen.getValueAt(0,1));
        //cmbSatuan.setSelectedItem((String)tblKonsumen.getValueAt(0,2));
        //  String harga = Double.toString((Double)tblBrg.getValueAt(0,3));
        //  txtHarga.setText(harga);
        //  String stok=Integer.toString((Integer)tblBrg.getValueAt(0,4));
        // txtStok.setText(stok);
        // String stokmin=Integer.toString((Integer)tblBrg.getValueAt(0,5));
        // txtStokMin.setText(stokmin);
}//GEN-LAST:event_tblKonsumenPropertyChange

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtKodeActionPerformed

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        // TODO add your handling code here:
        aktif(true);
        setTombol(false);
        kosong();
}//GEN-LAST:event_cmdTambahActionPerformed

    private void cmdSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdSimpanMouseClicked
        // TODO add your handling code here:
        String tKode=txtKode.getText();
        String tNama=txtNama.getText();
        String tAlm=txtAlm.getText();
        String tKota=txtKota.getText();
        String tKd_pos=txtKd_pos.getText();
        String tPhone=txtPhone.getText();
        String tEmail=txtEmail.getText();
        try{
            konsumen kons=new konsumen();
            if (edit==true) {
                //stm.executeUpdate("update barang set nm_brg='"+tNama+"',satuan='"+sSatuan+"',harga="+hrg+",stok="+stk+",stok_min="+stkMin+" where kd_brg='" + tKode + "'");
                
            }else {
                //stm.executeUpdate("INSERT into barang VALUES('"+tKode+"','"+tNama+"','"+sSatuan+"',"+hrg+","+stk+","+stkMin+")");
                
                kons.insert(tKode, tNama, tAlm, tKota, tKd_pos, tPhone, tEmail);
            }
           // tblKonsumen.setModel(new DefaultTableModel(dataTable,header));
           // baca_data();
             tblKonsumen.setModel(kons.tabMode);
            aktif(false);
            setTombol(true);
        }catch(Exception e) {
            //	System.out.println("Error : "+e);
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_cmdSimpanMouseClicked

    private void cmdSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSimpanActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSimpanActionPerformed

    private void cmdKoreksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKoreksiActionPerformed
        // TODO add your handling code here:
        edit=true;
        aktif(true);
        setTombol(false);
        txtKode.setEditable(false);
}//GEN-LAST:event_cmdKoreksiActionPerformed

    private void cmdHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHapusActionPerformed
        // TODO add your handling code here:
        try{
            konsumen kons=new konsumen();
           kons.delete(txtKode.getText());

            //stm.executeUpdate(sql);
            //baca_data();
            //setField();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_cmdHapusActionPerformed

    private void cmdBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBatalActionPerformed
        // TODO add your handling code here:
        //baca_data();
        // setField();
        aktif(false);
        setTombol(true);
}//GEN-LAST:event_cmdBatalActionPerformed

    private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed
        dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_cmdKeluarActionPerformed
private void kosong()
{
    txtKode.setText("");
    txtNama.setText("");
    txtAlm.setText("");
    txtKota.setText("");
    txtKd_pos.setText("");
    txtPhone.setText("");
    txtEmail.setText("");
}

private void aktif(boolean x)
{
    txtKode.setEditable(x);
    txtNama.setEditable(x);
    txtAlm.setEditable(x);
    txtKota.setEditable(x);
    txtKd_pos.setEditable(x);
    txtPhone.setEditable(x);
    txtEmail.setEditable(x);
}
private void setTombol(boolean t)
{
    cmdTambah.setEnabled(t);
    cmdKoreksi.setEnabled(t);
    cmdHapus.setEnabled(t);
    cmdSimpan.setEnabled(!t);
    cmdBatal.setEnabled(!t);
    cmdKeluar.setEnabled(t);

}
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKonsumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBatal;
    private javax.swing.JButton cmdHapus;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JButton cmdKoreksi;
    private javax.swing.JButton cmdSimpan;
    private javax.swing.JButton cmdTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblKonsumen;
    private javax.swing.JTextField txtAlm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKd_pos;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtKota;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

}
