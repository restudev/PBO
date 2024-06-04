/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restu.praktikum10;

/**
 *
 * @author D2A
 */
public class MebelDemo {

    public static void main(String[] args) {
        MejaTamu mt = new MejaTamu();
        mt.harga = 5000000;
        mt.bahan = "Jati";
        mt.jmlKaki = 4;
        mt.bentukKaca = "Oval";
        mt.discount(mt.harga);
        mt.cetak();
        System.out.println("------------------------------");
        AlmariPakaian ap = new AlmariPakaian();
        ap.harga = 5000000;
        ap.bahan = "Stainless";
        ap.jmlPintu = 3;
        ap.roda = false;
        ap.discount(ap.harga);
        ap.cetak();
    }
}
