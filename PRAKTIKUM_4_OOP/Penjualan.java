public class Penjualan {
    String kode, nama;
    float harga;
    int jumlah;

    public Penjualan() {
    };

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    float getTotalPembelian() {
        return harga * jumlah;
    }

    String getBonus() {
        String bonus = "";
        float totalPembelian = getTotalPembelian();

        if (totalPembelian >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (totalPembelian >= 50000 && jumlah > 2) {
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
        System.out.println("Total Harga : " + getTotalPembelian());
        System.out.println("Bonus : " + getBonus());
    }
}
