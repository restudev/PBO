import java.util.Random;
import java.util.Scanner;

class Agen extends Produk {
    String ketByr, souvenir;
    int jmlJual, waktuTempo, noNota, jnsByr;
    double totJual, ppn, bunga, totByr;

    Agen(String cabang) {
        System.out.println("Agen Aksesoris HP - " + cabang);
    }

    void setNota() {
        Random rand = new Random();
        noNota = rand.nextInt(999999);
        System.out.println("No. Nota	: " + noNota);
        inputProduk();
    }

    void inputJumlah() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Jual	: ");
        jmlJual = input.nextInt();
        totJual = getHargaJual() * jmlJual;
        System.out.println("Total		: " + totJual);
    }

    void inputJenis() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jenis bayar (1. Cash , 2. Tempo) :");
        jnsByr = input.nextInt();
        if (jnsByr == 1) {
            System.out.println("Ket.Bayar	: Cash");
            bunga = 0;
            ppn = 0.11 * totJual;
            System.out.println("PPN		: " + ppn);
        } else if (jnsByr == 2) {
            System.out.println("Ket.Bayar	: Tempo");
            System.out.print("Waktu Tempo (bulan): ");
            waktuTempo = input.nextInt();
            ppn = 0.11 * totJual;
            System.out.println("PPN		: " + ppn);
            if (waktuTempo > 1) {
                bunga = 0.05 * totJual;
            }
            System.out.println("Bunga		: " + bunga);
        } else {
            System.out.println("Input tidak valid! silakan inputkan kembali");
            inputJenis();
        }
    }

    double hitungJual() {
        totJual = getHargaJual() + ppn + bunga;
        return totJual;
    }

    void cetak() {
        totByr = totJual + ppn + bunga;
        System.out.println("Total Bayar	: " + totByr);
        if (jnsByr == 1 && (totJual >= 100000 && totJual <= 500000)) {
            souvenir = "Mug";
        } else if (jnsByr == 1 && (totJual > 500000 && totJual <= 750000)) {
            souvenir = "Payung";
        } else if (jnsByr == 1 && (totJual > 750000 && totJual <= 1000000)) {
            souvenir = "Tas";
        } else if (jnsByr == 1 && (totJual > 1000000)) {
            souvenir = "Voucher 100rb";
        } else {
            souvenir = "Tidak dapat souvenir";
        }
        System.out.println("Souvenir	: " + souvenir);
    }

    String getSouvenir() {
        return souvenir;
    }
}