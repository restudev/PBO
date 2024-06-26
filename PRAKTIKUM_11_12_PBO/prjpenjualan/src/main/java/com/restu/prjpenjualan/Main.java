/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restu.prjpenjualan;
import java.sql.*;

/**
 *
 * @author Restu
 */
public class Main {

    public static void main(String[] args) {
        KoneksiMySql kon = new KoneksiMySql("penjualan");
        Connection c = kon.getConnection();
        System.out.println("c : " + c);
    }
}
