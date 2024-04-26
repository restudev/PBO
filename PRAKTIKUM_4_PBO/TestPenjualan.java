import java.util.Scanner;

public class TestPenjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;

        do {
            Penjualan penjualan = new Penjualan();
            penjualan.inputData();
            penjualan.cetakNota();
            System.out.println("Input data lagi [Y/T]? ");
            inputLagi = input.nextLine();

        } while (inputLagi.equalsIgnoreCase("Y"));

        input.close();
    }
}
