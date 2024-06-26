import java.util.Scanner;

public class TokoDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cabang\t\t: ");
        String cabang = input.nextLine();
        System.out.print("Jumlah Inputan\t: ");
        int jumlah = input.nextInt();

        Toko[] produk = new Toko[jumlah];
        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            produk[i] = new Toko(cabang);
            produk[i].setNota();
            produk[i].inputJumlah();
            produk[i].inputJenis();
            produk[i].cetak();
            total += produk[i].hitungJual();
        }

        produk[0].judulLap(cabang);
        produk[0].daftarJual(cabang);
        for (int i = 0; i < jumlah; i++) {
            String leftAlignFormat = "| %-2s | %-6s | %-13s | %-12s | %-9s | %-12s | %-12s | %-12s | %-12s | %-20s |%n";
            System.out.format(leftAlignFormat, (i + 1), produk[i].noNota, produk[i].barCode,
                    String.format("%.2f", produk[i].hrgJual), produk[i].jmlJual,
                    String.format("%.2f", produk[i].getHargaJual()), produk[i].bunga,
                    String.format("%.2f", 0.11 * produk[i].getHargaJual()),
                    String.format("%.2f", produk[i].hitungJual()), produk[i].getSouvenir());
            System.out.format(
                 "---------------------------------------------------------------------------------------------------------------------------------------------%n");
        }

        String totalString = String.format("\t\t\t\t\t\t\t\t\t\t***Total***\t\t %.2f", total);
        String totalFormat = "| " + String.format("%-58s", totalString) + " |%n";
        System.out.format(totalFormat);
        System.out.format("---------------------------------------------------------------------------------------------------------------------------------------------%n");
    }
}
