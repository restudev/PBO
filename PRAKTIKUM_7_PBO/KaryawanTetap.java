import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaryawanTetap extends Karyawan {
    double gapok;
    int jml_anak;

    void inputTetap() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------- Karyawan Tetap ----------");
        System.out.print("Gaji Pokok	: ");
        gapok = Double.parseDouble(br.readLine());
        System.out.print("Jumlah Anak	: ");
        jml_anak = Integer.parseInt(br.readLine());
    }

    double totalGaji() {
        return gapok + (jml_anak * (0.1 * gapok));
    }
}
