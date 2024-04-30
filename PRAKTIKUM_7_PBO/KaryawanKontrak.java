import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaryawanKontrak extends Karyawan {
    double upah_harian;
    int jml_anak, hari_masuk;

    void inputKontrak() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------- Karyawan Kontrak ----------");
        System.out.println("Upah Harian	: ");
        upah_harian = Double.parseDouble(br.readLine());
        System.out.print("Jumlah Masuk	: ");
        hari_masuk = Integer.parseInt(br.readLine());
        System.out.print("Jumlah Anak	: ");
        jml_anak = Integer.parseInt(br.readLine());

    }

    double totalUpah() {
        return (hari_masuk * upah_harian) + (jml_anak * (0.1 * (hari_masuk * upah_harian)));
    }
}
