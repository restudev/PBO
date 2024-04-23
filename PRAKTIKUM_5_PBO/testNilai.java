import java.util.Scanner;
import java.io.*; 

public class testNilai {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(
		// 	new InputStreamReader(System.in));
        // String inputLagi = "";
		
		// Nilai nilaiku = new Nilai();
		// nilaiku.nim = "A11.2022.14668";
		// nilaiku.nama = "Restu Lestari";
		// nilaiku.nilaiTugas = 97;
		// nilaiku.nilaiUts = 95;
		// nilaiku.nilaiUas = 95;
		// nilaiku.hitungNilai();
		// nilaiku.cetakNilai();

        // do{
        // Nilai mahasiswa1 = new Nilai();
        // mahasiswa1.inputNilai();
        // mahasiswa1.hitungNilai();
        // mahasiswa1.cetakNilai();

        // System.out.println("Input data lagi [Y/T]? ");
        // inputLagi = input.nextLine();
        // } while (inputLagi.equalsIgnoreCase("Y"));

        System.out.print("Jumlah Mahasiswa : ");
        int n = input.nextInt();
        Nilai[] nilaibyk = new Nilai[n];
        for (int i = 0; i < n; i++){
            System.out.println("Mahasiswa Ke : "+(i+1));
            nilaibyk[i] = new Nilai();
            nilaibyk[i].inputNilai();
            nilaibyk[i].hitungNilai();
            nilaibyk[i].cetakNilai();
        }
        nilaibyk[0].judul();
        for (int i = 0; i < n; i++){
            nilaibyk[i].daftarNilai();
        }
    }

}
