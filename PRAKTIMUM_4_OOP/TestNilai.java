import java.util.Scanner;

public class TestNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;

        do{
        Nilai mahasiswa1 = new Nilai("08982983", "Ghiyatsi", 90, 80, 87);
        mahasiswa1.inputNilai();
        mahasiswa1.hitungNilai();
        mahasiswa1.cetakNilai();

        System.out.println("Input data lagi [Y/T]? ");
        inputLagi = input.nextLine();
        } while (inputLagi.equalsIgnoreCase("Y"));

        input.close();
    }

}
