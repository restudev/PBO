import java.util.Random;
import java.util.Scanner;

class Grosir extends Produk {
    String ketByr, souvenir;
    int jmlJual, waktuTempo, noNota, jnsByr;
    double totJual, ppn, bunga, totByr;

    Grosir(String cabang) {
        System.out.println("Grosir EsTeh Ajib - " + cabang);
    }

    void setNota() {
        Random rand = new Random();
        noNota = rand.nextInt(999999);
        System.out.println("No. Nota\t: " + noNota);
        inputProduk();
    }

    double getHargaJual(){
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
        System.out.print("Jenis bayar (1. Cash , 2. Tempo) : ");
        jnsByr = input.nextInt();
        if (jnsByr == 1) {
            System.out.println("Ket.Bayar\t: Cash");
            bunga = 0;
            ppn = 0.11 * getHargaJual();
            System.out.println("PPN\t\t: " + ppn);
        } else if (jnsByr == 2) {
            System.out.println("Ket.Bayar\t: Tempo");
            System.out.print("Waktu Tempo (Minggu) : ");
            waktuTempo = input.nextInt();
            ppn = 0.11 * getHargaJual();
            System.out.println("PPN\t\t: " + ppn);
            if (waktuTempo > 2) {
                bunga = 0.05 * getHargaJual();
            }
            System.out.println("Bunga\t\t: " + bunga);
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
        System.out.println("Total Bayar\t: " + hitungJual());
        if (jnsByr == 1 && (totJual >= 100000 && totJual <= 500000)) {
            souvenir = "Mangkok";
        } else if (jnsByr == 1 && (totJual > 500000 && totJual <= 750000)) {
            souvenir = "Payung";
        } else if (jnsByr == 1 && (totJual > 750000 && totJual <= 1000000)) {
            souvenir = "Tas Belanja";
        } else if (jnsByr == 1 && (totJual > 1000000)) {
            souvenir = "Voucher 100rb";
        } else {
            souvenir = "Tidak dapat souvenir";
        }
        System.out.println("Souvenir\t: " + souvenir);
    }

    String getSouvenir() {
        return souvenir;
    }
}
