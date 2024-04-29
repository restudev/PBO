import java.util.Scanner;

public class Produk {
    String nmProduk, kdProduk;
    double hrgBeli, hrgJual;

    void inputProduk() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Produk	: ");
        kdProduk = input.nextLine();
        System.out.print("Nama Produk	: ");
        nmProduk = input.nextLine();
        System.out.print("Harga Beli	: ");
        hrgBeli = input.nextFloat();

        if (hrgBeli > 200000) {
            hrgJual = hrgBeli + 0.5 * hrgBeli;
            System.out.println("Harga Jual	: " + hrgJual);
        } else if (hrgBeli > 100000) {
            hrgJual = hrgBeli + 0.75 * hrgBeli;
            System.out.println("Harga Jual	: " + hrgJual);
        } else if (hrgBeli > 50000) {
            hrgJual = hrgBeli + 1 * hrgBeli;
            System.out.println("Harga Jual	: " + hrgJual);
        } else if (hrgBeli > 25000) {
            hrgJual = hrgBeli + 1.5 * hrgBeli;
            System.out.println("Harga Jual	: " + hrgJual);
        } else if (hrgBeli < 25000) {
            hrgJual = hrgBeli + 2 * hrgBeli;
            System.out.println("Harga Jual	: " + hrgJual);
        }
    }
}
