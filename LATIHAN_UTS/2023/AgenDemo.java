import java.util.Scanner;

public class AgenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cabang\t\t: ");
        String namaAgent = input.nextLine();
        System.out.print("Jumlah Inputan\t: ");
        int jumlah = input.nextInt();

        Agen[] produk = new Agen[jumlah];
        for (int i = 0; i < jumlah; i++) {
            produk[i] = new Agen(namaAgent);
            produk[i].setNota();
            produk[i].inputJumlah();
            produk[i].inputJenis();
            produk[i].cetak();
        }

        System.out.println("\nDaftar Agen Aksesori Hp - " + namaAgent);
        String leftAlignFormat = "| %-2s | %-6s | %-16s | %-12s | %-9s | %-12s | %-8s | %-12s | %-12s | %-12s | %-20s |%n";
        System.out.format(
                "===========================================================================================================================================================%n");
        System.out.format(
                "| No | Nota   | Nama Barang       | Harga Jual   | Jml Jual  | Tot Jual     | Tempo    | Bunga        | PPN          | Total Bayar  | Souvenir             |%n");
        System.out.format(
                "===========================================================================================================================================================%n");
        for (int i = 0; i < jumlah; i++) {
            System.out.format(leftAlignFormat, (i + 1), produk[i].noNota, produk[i].nmProduk,
                    String.format("%.2f", produk[i].hrgJual), produk[i].jmlJual,
                    String.format("%.2f", produk[i].getHargaJual()), produk[i].waktuTempo,
                    String.format("%.2f", produk[i].bunga), String.format("%.2f", 0.11 * produk[i].getHargaJual()),
                    String.format("%.2f", produk[i].hitungJual()), produk[i].getSouvenir());
        }
        System.out.format(
                "===========================================================================================================================================================%n");

    }
}