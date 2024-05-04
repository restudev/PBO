import java.util.Scanner;
import java.io.*; 

public class TestNilai {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
        String inputLagi = "";
		
		Nilai nilaiku = new Nilai();
		nilaiku.nim = "A11.2022.1xxxx";
		nilaiku.nama = "Restu";
		nilaiku.nilaiTugas = 97;
		nilaiku.nilaiUts = 95;
		nilaiku.nilaiUas = 95;
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
