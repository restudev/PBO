import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah Data: ");
        int jumlah = scanner.nextInt();
        int[] x = new int[jumlah];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println("Hasil Nilai x[" + i + "]: " + x[i]);
        }
    }
}
