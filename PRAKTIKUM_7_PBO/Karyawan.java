import java.io.*;

public class Karyawan {
    String nip, nama;
    int sts_peg;

    void inputKar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Data karyawan");
        System.out.print("NIP		: ");
        nip = br.readLine();
        System.out.print("Nama		: ");
        nama = br.readLine();
        System.out.print("Status Pegawai	: ");
        sts_peg = Integer.parseInt(br.readLine());
    }
}
