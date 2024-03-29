import java.util.Scanner;

public class TestKonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;


        do {
            KonversiDetik konversi = new KonversiDetik();

            konversi.inputDetik();
            konversi.hari();
            konversi.jam();
            konversi.menit();
            konversi.detik();

            System.out.println("Input data lagi [Y/T]? ");
            inputLagi = input.nextLine();

        } while (inputLagi.equalsIgnoreCase("Y"));

        input.close();
    }
}
