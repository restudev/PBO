import java.util.Scanner;

class Agen extends Produk {
    String noNota, jnsByr, ketByr, souvenir;
    int jmlJual, waktuTempo;
    double totJual, ppn, bunga, totByr;

    public Agen(String cabang) {
        System.out.println("Cabang: " + cabang);
    }

    public void setNota(String nota) {
        noNota = nota;
    }

    public void inputJumlah() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Jual: ");
        jmlJual = Integer.parseInt(input.nextLine());
    }

    public void inputJenis() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jenis Bayar (1. Cash, 2. Tempo): ");
        int jenis = Integer.parseInt(input.nextLine());
        jnsByr = (jenis == 1) ? "Cash" : "Tempo";
        if (jenis == 2) {
            System.out.print("Waktu Tempo (dalam bulan): ");
            waktuTempo = Integer.parseInt(input.nextLine());
        }
    }

    public void hitungJual() {
        totJual = jmlJual * getHargaJual();
        ppn = 0.11 * totJual;
        if (jnsByr.equals("Tempo") && waktuTempo > 1)
            bunga = 0.05 * totJual;
        else
            bunga = 0;

        totByr = totJual + ppn + bunga;

    }

    private void printSouvenir(double totalBayar) {
        System.out.print("Souvenir: ");
        if (totalBayar >= 100000 && totalBayar <= 500000)
            System.out.println("Mug");
        else if (totalBayar <= 750000)
            System.out.println("Payung");
        else if (totalBayar <= 1000000)
            System.out.println("Tas Belanja");
        else
            System.out.println("Voucher 100rb");
    }

    private void printSouvenir(String message) {
        System.out.println("Souvenir: " + message);
    }

    public void cetak() {
        System.out.println("\n===== NOTA PENJUALAN =====");
        System.out.println("No. Nota: " + noNota);
        System.out.println("Kode Produk: " + kdProduk);
        System.out.println("Nama Produk: " + nmProduk);
        System.out.println("Harga Jual per Unit: " + hrgJual);
        System.out.println("Jumlah Jual: " + jmlJual);
        System.out.println("Total Jual: " + totJual);
        System.out.println("Jenis Bayar: " + jnsByr);
        if (jnsByr.equals("Tempo")) {
            System.out.println("Waktu Tempo: " + waktuTempo + " bulan");
            System.out.println("PPN: " + ppn);
            System.out.println("Bunga: " + bunga);
            System.out.println("Total Bayar: " + totByr);
            printSouvenir("Tidak dapat souvenir");
        } else {
            System.out.println("PPN: " + ppn);
            System.out.println("Bunga: " + bunga);
            System.out.println("Total Bayar: " + totByr);
            printSouvenir(totByr);
        }
    }

}
