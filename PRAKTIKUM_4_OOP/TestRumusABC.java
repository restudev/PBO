import java.util.Scanner;

public class TestRumusABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;

        RumusABC rumus = new RumusABC();

        do {
            System.out.println("Masukkan nilai a : ");
            float a = input.nextFloat();
            System.out.println("Masukkan nilai b : ");
            float b = input.nextFloat();
            System.out.println("Masukkan nilai c : ");
            float c = input.nextFloat();

            rumus.Determinan(a, b, c);
            System.out.println("Input data lagi [Y/T]?");
            inputLagi = input.next();

        } while (inputLagi.equalsIgnoreCase("Y"));

        input.close();
    }
}