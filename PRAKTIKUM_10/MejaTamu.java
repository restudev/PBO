/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restu.praktikum10;

/**
 *
 * @author D2A
 */
public class MejaTamu extends Meja implements Discountable {

    public String bentukKaca;
    float discount;

    public void discount(int harga) {
        discount = harga * 0.1f;
    }

    void cetak() {
        System.out.println("Harga\t\t: " + harga);
        System.out.println("Bahan\t\t: " + bahan);
        System.out.println("Jumlah Kaki\t: " + jmlKaki);
        System.out.println("Kaca\t\t: " + bentukKaca);
        System.out.println("Discount\t: " + discount);
        System.out.println("Bayar\t\t: " + (harga - discount));
    }
}
