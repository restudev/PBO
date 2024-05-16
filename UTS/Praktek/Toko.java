import java.util.Random;
import java.util.Scanner;

class Toko extends Barang {
    String ketByr, souvenir;
    int jmlJual, waktuTempo, noNota, jnsByr;
    double totJual, ppn, bunga, totByr, beaKartu;

    Toko(String cabang) {
        System.out.println("Najwa Shop - " + cabang);
    }

    void setNota() {
        Random rand = new Random();
        noNota = rand.nextInt(999999);
        System.out.println("No. Nota\t: " + noNota);
        inputBarang();
    }

    double getHargaJual() {
        return hrgJual * jmlJual;
    }

    void inputJumlah() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Jual\t: ");
        jmlJual = input.nextInt();
        getHargaJual();
        System.out.println("Total\t\t: " + getHargaJual());
    }

    void inputJenis() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jenis bayar (1. Cash , 2. Debit, 3.Tempo ) : ");
        jnsByr = input.nextInt();
        if (jnsByr == 1) {
            System.out.println("Ket.Bayar\t: Cash");
            bunga = 0;
            ppn = 0.11 * getHargaJual();
            System.out.println("PPN\t\t: " + ppn);
        } else if (jnsByr == 2) {
            System.out.println("Ket.Bayar\t: Debit");
            beaKartu = 1500;
            System.out.println("Bea Kartu\t: " + beaKartu);
        } else if (jnsByr == 3) {
            System.out.println("Ket.Bayar\t: Tempo");
            System.out.print("Waktu Tempo (Hari) : ");
            waktuTempo = input.nextInt();
            ppn = 0.11 * getHargaJual();
            System.out.println("PPN\t\t: " + ppn);
            if (waktuTempo > 14) {
                bunga = 0.025 * getHargaJual();
            }
            System.out.println("Bunga\t\t: " + bunga);
        } else {
            System.out.println("Input tidak valid! silakan inputkan kembali");
            inputJenis();
        }
    }

    double hitungJual() {
        if (jnsByr == 1 && jnsByr == 3) {
            totJual = getHargaJual() + ppn + bunga;
            return totJual;
        } else {
            totJual = getHargaJual() + ppn + bunga + beaKartu;
            return totJual;
        }
    }

    void cetak() {
        System.out.println("Total Bayar\t: " + hitungJual());
        if (jnsByr == 1 && (totJual >= 100000 && totJual <= 500000)) {
            souvenir = "Mangkok Lucu";
        } else if (jnsByr == 1 && (totJual > 500000 && totJual <= 750000)) {
            souvenir = "Payung Besar";
        } else if (jnsByr == 1 && (totJual > 750000 && totJual <= 1000000)) {
            souvenir = "Tas Imut";
        } else if (jnsByr == 1 && (totJual > 1000000)) {
            souvenir = "Voucher 100rb";
        } else {
            souvenir = "Tidak dapat souvenir";
        }
        System.out.println("Souvenir\t: " + souvenir);
    }

    void judulLap(String cabang) {
        System.out.println("\nDaftar Penjualan Najwa Shop - " + cabang);
    }

    void daftarJual(String cabang) {
        System.out.format(
                "--------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format(
                "| No | Nota   | Barcode       | Harga Jual   | Jml Jual  | Total      | Bunga          | PPN          | Total Bayar  | Souvenir             |%n");
        System.out.format(
                "--------------------------------------------------------------------------------------------------------------------------------------------%n");
    }

    String getSouvenir() {
        return souvenir;
    }
}
