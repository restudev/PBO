import java.util.Scanner;

public class Penjualan {
    String kode, nama;
    float harga;
    double total;
    int jumlah;
    Scanner key = new Scanner(System.in);


    public Penjualan() {
    };

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    void inputData(){
        System.out.println("Masukkan data penjualan");
        System.out.println("Kode Barang : ");
        kode = key.nextLine();
        System.out.println("Nama Barang : ");
        nama = key.nextLine();
        System.out.println("Harga Satuan Barang : ");
        harga = key.nextFloat();
        System.out.println("Jumlah Barang : ");
        jumlah = key.nextInt();
    }

    void hitungTotal() {
        total = harga * jumlah;
        System.out.println("Total Harga : " + total);
    }

    String getBonus() {
        String bonus = "";

        if (total >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (total >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (total >= 50000 && jumlah > 2) {
            bonus = "Ballpoint";
        } else
            bonus = "tidak mendapatkan bonus";
        return bonus;
    }

    void cetakNota() {
        System.out.println("========== Data Penjualan ==========");
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Satuan Barang : " + harga);
        System.out.println("Jumlah Barang : " + jumlah);
        hitungTotal();
        System.out.println("Bonus : " + getBonus());
    }
}
