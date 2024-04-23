import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        ArrayList<Integer> kurang = new ArrayList<Integer>();
        ArrayList<Integer> kali = new ArrayList<Integer>();
        ArrayList<Float> bagi = new ArrayList<Float>();
        
        System.out.println("Masukkan nilai 1");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai1.add(scanner.nextInt());
        }
        System.out.println();
        
        System.out.println("Masukkan nilai 2");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai2.add(scanner.nextInt());
        }
        System.out.println();

        // Penjumlahan
        for (int i = 0; i < jumlahData; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
        }
        System.out.println("Hasil Penjumlahan nilai 1 + nilai 2");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil index ke-" + (i+1) + " = " + jumlah.get(i));
        }
        System.out.println();

        // Pengurangan
        for (int i = 0; i < jumlahData; i++) {
            kurang.add(nilai1.get(i) - nilai2.get(i));
        }
        System.out.println("Hasil Pengurangan nilai 1 - nilai 2");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil index ke-" + (i+1) + " = " + kurang.get(i));
        }
        System.out.println();

        // Perkalian
        for (int i = 0; i < jumlahData; i++) {
            kali.add(nilai1.get(i) * nilai2.get(i));
        }
        System.out.println("Hasil Perkalian nilai 1 * nilai 2");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil index ke-" + (i+1) + " = " + kali.get(i));
        }
        System.out.println();

        // Pembagian
        for (int i = 0; i < jumlahData; i++) {
            bagi.add((float) nilai1.get(i) / nilai2.get(i));
        }
        System.out.println("Hasil Pembagian nilai 1 / nilai 2");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil index ke-" + (i+1) + " = " + bagi.get(i));
        }
        
        scanner.close();
    }
}
