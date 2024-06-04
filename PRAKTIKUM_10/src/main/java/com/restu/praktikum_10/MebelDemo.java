/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restu.praktikum_10;

/**
 *
 * @author Restu
 */
public class MebelDemo {

    public static void main(String[] args) {
        System.out.println("---------------MEJA TAMU---------------");
        MejaTamu mt = new MejaTamu();
        mt.harga = 5000000;
        mt.bahan = "Jati";
        mt.jmlKaki = 4;
        mt.bentukKaca = "Oval";
        mt.discount(mt.harga);
        mt.cetak();
        System.out.println("---------------MEJA MAKAN---------------");
        MejaMakan mm = new MejaMakan();
        mm.harga = 5000000;
        mm.bahan = "Jati";
        mm.jmlKaki = 4;
        mm.jmlKursi = 6;
        mm.cetak();
        System.out.println("---------------ALMARI PAKAIAN---------------");
        AlmariPakaian ap = new AlmariPakaian();
        ap.harga = 5000000;
        ap.bahan = "Stainless";
        ap.jmlPintu = 3;
        ap.roda = false;
        ap.discount(ap.harga);
        ap.cetak();
        System.out.println("---------------ALMARI MAKAN---------------");
        AlmariMakan am = new AlmariMakan();
        am.harga = 5000000;
        am.bahan = "Stainless";
        am.jmlRoda = 4;
        am.discount(ap.harga);
        am.cetak();
    }
}
