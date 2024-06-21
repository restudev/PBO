/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restu.praktikum_10;

/**
 *
 * @author Restu
 */
public class Zoo3Abstract {
    static void test(Binatang a){
        a.makan();
        a.tidur();
        a.mati();
    }
    public static void main(String[] args) {
        Harimau macan = new Harimau();
        Bebek donald = new Bebek();

        // Binatang b = new Binatang(); -> error abstract class tidak bisa dibuat objek

        test(macan);
        test(donald);
    }
}
