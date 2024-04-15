import java.util.Scanner;

public class latihan1_looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        int hasil = 1;
        for (int i = 1; i <= bilangan; i++) {
            hasil *= i;
            if (i == 1) {
                continue;
            } else {
                System.out.print(hasil / i + " x " + i);
            }
            System.out.println(" = " + hasil);
        }
    }
}
