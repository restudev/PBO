import java.util.Scanner;

public class latihan2_looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        System.out.println("Bilangan: " + bilangan);
        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("-----------------");

        System.out.print("Dipecah: ");
        int pecahan = scanner.nextInt();
        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i + " ");
            if (i % pecahan == 0) {
                System.out.println();
            }
        }
    }
}
