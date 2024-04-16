import java.util.Scanner;

public class programMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matriks A
        System.out.print("Input baris matriks A: ");
        int barisA = scanner.nextInt();
        System.out.print("Input kolom matriks A: ");
        int kolomA = scanner.nextInt();
        int[][] matriksA = inputMatriks(scanner, barisA, kolomA, "A");

        // Input matriks B
        System.out.print("Input baris matriks B: ");
        int barisB = scanner.nextInt();
        System.out.print("Input kolom matriks B: ");
        int kolomB = scanner.nextInt();
        int[][] matriksB = inputMatriks(scanner, barisB, kolomB, "B");

        // Penjumlahan matriks A dan B
        if (barisA == barisB && kolomA == kolomB) {
            System.out.println("Hasil penjumlahan matriks A dan B:");
            int[][] hasilJumlah = jumlahkanMatriks(matriksA, matriksB);
            printMatriks(hasilJumlah);

            // Transpose dari hasil penjumlahan matriks A dan B
            System.out.println("Hasil transpose Matriks C");
            int[][] transposeHasilJumlah = transposeMatriks(hasilJumlah);
            printMatriks(transposeHasilJumlah);
        } else {
            System.out.println("Operasi matriks tidak mungkin dengan dimensi yang diberikan.");
        }

        // Perkalian matriks A dan B
        if (kolomA == barisB) {
            System.out.println("Hasil perkalian matriks A dengan matriks B:");
            int[][] hasilKali = kalikanMatriks(matriksA, matriksB);
            printMatriks(hasilKali);
        } else {
            System.out.println("Perkalian matriks tidak mungkin dengan dimensi yang diberikan.");
        }

        scanner.close();
    }

    // Method untuk input elemen-elemen matriks
    static int[][] inputMatriks(Scanner scanner, int baris, int kolom, String namaMatriks) {
        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Input elemen matriks " + namaMatriks + " [" + i + "," + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }
        return matriks;
    }

    // Method untuk menjumlahkan dua matriks
    static int[][] jumlahkanMatriks(int[][] matriksA, int[][] matriksB) {
        int baris = matriksA.length;
        int kolom = matriksA[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        return hasil;
    }

    // Method untuk mentranspose matriks
    static int[][] transposeMatriks(int[][] matriks) {
        int baris = matriks.length;
        int kolom = matriks[0].length;
        int[][] hasil = new int[kolom][baris];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[j][i] = matriks[i][j];
            }
        }
        return hasil;
    }

    // Method untuk mengalikan dua matriks
    static int[][] kalikanMatriks(int[][] matriksA, int[][] matriksB) {
        int barisA = matriksA.length;
        int kolomA = matriksA[0].length;
        int kolomB = matriksB[0].length;
        int[][] hasil = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
        return hasil;
    }

    // Method untuk mencetak matriks
    static void printMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
}
