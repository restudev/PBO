import java.util.Scanner;
public class Nilai {
    String nim;
    String nama;
    float nilaiUts, nilaiTugas, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;
    String predikat;
    String nHuruf;

    Scanner key = new Scanner(System.in); 
    public Nilai(){}; //konstruktor
    public Nilai(String nim, String nama, float nilaiUts, float nilaiTugas, float nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
    }
    void inputNilai() {
        System.out.print("Nim : ");
        nim = key.nextLine();
        System.out.print("Nama : ");
        nama = key.nextLine();
        System.out.print("Nilai Tugas : ");
        nilaiTugas = key.nextFloat();
        System.out.print("Nilai UTS : ");
        nilaiUts = key.nextFloat();
        System.out.print("Nilai UAS : ");
        nilaiUas = key.nextFloat();
    }

    void hitungNilai() {
        pNilaiTugas = nilaiTugas * 0.20f;
        pNilaiUts = nilaiUts * 0.35f;
        pNilaiUas = nilaiUas * 0.45f;
        nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
    }

    String getNilHuruf(float nilai) {
        if (nilai >= 85)
            nHuruf = "A";
        else if (nilai >= 70 && nilai < 85)
            nHuruf = "B";
        else if (nilai >= 60 && nilai < 70)
            nHuruf = "C";
        else if (nilai >= 40 && nilai < 60)
            nHuruf = "D";
        else
            nHuruf = "E";
        return nHuruf;
    }

    String getPredikat(String huruf) {
        switch (huruf) {
            case "A":
                predikat = "Apik";
                break;
            case "B":
                predikat = "Baik";
                break;
            case "C":
                predikat = "Cukup";
                break;
            case "D":
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }
        return predikat;
    }

    void cetakNilai() {
        hitungNilai();
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai UTS   : " + nilaiUts +" 20%   : " +pNilaiUts);
        System.out.println("Nilai Tugas : " + nilaiTugas +" 35%   : " +pNilaiTugas);
        System.out.println("Nilai UAS   : " + nilaiUas +" 45%   : " +pNilaiUas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + getNilHuruf(nilaiAkhir));
        System.out.println("Predikat    : " + getPredikat(nHuruf));
    }

}