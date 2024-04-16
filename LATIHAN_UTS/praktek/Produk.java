import java.util.Scanner;

class Produk {
    String kdProduk, nmProduk;
    double hrgBeli, hrgJual;

    public void inputProduk() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Produk: ");
        kdProduk = input.nextLine();
        System.out.print("Nama Produk: ");
        nmProduk = input.nextLine();
        System.out.print("Harga Beli: ");
        hrgBeli = input.nextDouble();
    }

    public double getHargaJual() {
        if (hrgBeli > 200000)
            hrgJual = hrgBeli + 0.1 * hrgBeli;
        else if (hrgBeli > 100000)
            hrgJual = hrgBeli + 0.15 * hrgBeli;
        else if (hrgBeli > 50000)
            hrgJual = hrgBeli + 0.2 * hrgBeli;
        else if (hrgBeli > 25000)
            hrgJual = hrgBeli + 0.3 * hrgBeli;
        else
            hrgJual = hrgBeli + 0.5 * hrgBeli;

        return hrgJual;
    }
}