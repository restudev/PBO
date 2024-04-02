import java.util.Scanner;
import java.io.*; 

public class TestNilai {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
        String inputLagi = "";
		
		Nilai nilaiku = new Nilai();
		nilaiku.nim = "A11.2022.12345";
		nilaiku.nama = "Siapa";
		nilaiku.nilaiTugas = 80;
		nilaiku.nilaiUts = 90;
		nilaiku.nilaiUas = 100;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();

        do{
        Nilai mahasiswa1 = new Nilai();
        mahasiswa1.inputNilai();
        mahasiswa1.hitungNilai();
        mahasiswa1.cetakNilai();

        System.out.println("Input data lagi [Y/T]? ");
        inputLagi = input.nextLine();
        } while (inputLagi.equalsIgnoreCase("Y"));

    }

}
