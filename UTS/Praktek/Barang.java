import java.util.Scanner;

public class Barang {
    String nmBarang, barCode;
    double hrgBeli, hrgJual;

    void inputBarang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Produk\t: ");
        barCode = input.nextLine();
        System.out.print("Nama Produk\t: ");
        nmBarang = input.nextLine();
        System.out.print("Harga Beli\t: ");
        hrgBeli = input.nextFloat();

        if (hrgBeli > 500000) {
            hrgJual = hrgBeli + 0.1 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli > 200000) {
            hrgJual = hrgBeli + 0.25 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli > 100000) {
            hrgJual = hrgBeli + 0.5 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli > 50000) {
            hrgJual = hrgBeli + 0.75 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        } else if (hrgBeli < 50000) {
            hrgJual = hrgBeli + 1 * hrgBeli;
            System.out.println("Harga Jual\t: " + hrgJual);
        }
    }
}

