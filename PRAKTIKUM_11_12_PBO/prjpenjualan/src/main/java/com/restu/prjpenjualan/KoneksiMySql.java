/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restu.prjpenjualan;

/**
 *
 * @author Restu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Restu
 */
public class KoneksiMySql {
    String url, usr, pwd, dbn;
    public KoneksiMySql (String dbn) {
        this.url = "jdbc:mysql://localhost/" + dbn;
        this.usr = "root"; // Sesuaikan dengan username db
        this.pwd = ""; // Sesuaikan dengan password db
    }
    public KoneksiMySql (String host, String user, String pass,String dbn) {
        this.url = "jdbc:mysql://" + host + "/" + dbn;
        this.usr = user;
        this.pwd = pass;
    }
    
    public Connection getConnection() {
    Connection con = null;
    try {
//        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(this.url, this.usr, this.pwd);
        System.out.println("Koneksi Berhasil");
    } catch (ClassNotFoundException e) {
        System.out.println ("Error #1 : " + e.getMessage());
        System.exit(0);
    } catch (SQLException e) {
        System.out.println ("Error #2 : " + e.getMessage());
        System.exit(0);
    }
        return con;
    }
    
    public static void main (String args[]) {
        KoneksiMySql kon = new KoneksiMySql ("penjualan"); //Sesuaikan dengan nama database
        Connection c = kon.getConnection();
    }
    
}