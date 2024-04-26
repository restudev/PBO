import java.util.Scanner;

public class TestDeterminan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;

        do {
            Determinan abc = new Determinan();
            abc.inputABC();
			abc.hitungD();
			//abc.hitungX1X2();
            abc.cetakdeterminan();

            System.out.println("Input data lagi [Y/T]?");
            inputLagi = input.next();

        } while (inputLagi.equalsIgnoreCase("Y"));

        input.close();
    }
}