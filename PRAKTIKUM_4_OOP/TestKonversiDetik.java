import java.util.Scanner;

public class TestKonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;

        KonversiDetik konversi = new KonversiDetik();

        do {
            System.out.println("Detik   : ");
            int detik = input.nextInt();

            int hari = konversi.hari(detik);
            int jam = konversi.jam(detik);
            int menit = konversi.menit(detik);
            int sisaDetik = konversi.detik(detik);

            System.out.println("========== Hasil konversi ==========");
            System.out.println("Detik : " + detik);
            System.out.println("Hari : " + hari);
            System.out.println("Jam  : " + jam);
            System.out.println("Menit: " + menit);
            System.out.println("Detik: " + sisaDetik);

            System.out.println("Input data lagi [Y/T]? ");
            input.nextLine();
            inputLagi = input.nextLine();

        } while (inputLagi.equalsIgnoreCase("Y"));

        input.close();
    }
}
