import java.util.Scanner;

public class TestPenjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;

        do {
            System.out.println("Masukkan data penjualan");
            System.out.println("Kode Barang : ");
            String kode = input.nextLine();
            System.out.println("Nama Barang : ");
            String nama = input.nextLine();
            System.out.println("Harga Satuan Barang : ");
            float harga = input.nextFloat();
            System.out.println("Jumlah Barang : ");
            int jumlah = input.nextInt();

            Penjualan penjualan = new Penjualan();
            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();
            System.out.println("Input data lagi [Y/T]? ");
            input.nextLine();
            inputLagi = input.nextLine();

        } while (inputLagi.equalsIgnoreCase("Y"));

        input.close();
    }
}
