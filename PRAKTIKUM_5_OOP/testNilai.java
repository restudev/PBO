import java.util.Scanner;

public class testNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah data mahasiswa: ");
        int jumlah = scanner.nextInt();

        Nilai[] mahasiswa = new Nilai[jumlah]; // Array objek untuk menyimpan data mahasiswa

        // Memasukkan data untuk setiap mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            mahasiswa[i] = new Nilai();
            mahasiswa[i].inputNilai();
        }

        // Menampilkan daftar nilai mahasiswa
        Nilai.daftarNilai(mahasiswa);
    }
}
