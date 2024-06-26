import java.util.Scanner;

public class Produk {
    String nmProduk, kdProduk;
    double hrgBeli, hrgJual;

    void inputProduk() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Produk\t: ");
        kdProduk = input.nextLine();
        System.out.print("Nama Produk\t: ");
        nmProduk = input.nextLine();
        System.out.print("Harga Beli\t: ");
        hrgBeli = input.nextFloat();

        if (hrgBeli > 200000) {
            hrgJual = hrgBeli + 0.1 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli > 100000) {
            hrgJual = hrgBeli + 0.15 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli > 50000) {
            hrgJual = hrgBeli + 0.2 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli > 25000) {
            hrgJual = hrgBeli + 0.3 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli < 25000) {
            hrgJual = hrgBeli + 0.5 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        }
    }
}

