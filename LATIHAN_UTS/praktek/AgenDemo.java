import java.util.Scanner;

class AgenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Cabang	: ");
        String cabang = input.nextLine();

        Agen agen = new Agen(cabang);

        System.out.print("No. Nota	: ");
        String noNota = input.nextLine();
        agen.setNota(noNota);

        agen.inputProduk();
        agen.inputJumlah();
        agen.inputJenis();
        agen.hitungJual();
        agen.cetak();
    }
}