class dataNilai{
    String nim;
    String nama;
    double nilaiUts, nilaiTugas, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;

    public dataNilai(String nim, String nama, double nilaiUts, double nilaiTugas, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
    }

    void hitungNilai(){
        pNilaiTugas = nilaiTugas * 0.20;
        pNilaiUts = nilaiUts * 0.35;
        pNilaiUas = nilaiUas * 0.45;
        nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
    }
    
    void cetakNilai(){
        System.out.println("NIM	: " + nim);
        System.out.println("Nama	: " + nama);
        System.out.println("Nilai UTS	: " + nilaiUts +"  20%   :   " +pNilaiUts);
        System.out.println("Nilai Tugas	: " + nilaiTugas +"  35%   :   " +pNilaiTugas);
        System.out.println("Nilai UAS	: " + nilaiUas +"  45%   :   " +pNilaiUas);
        System.out.println("Nilai Akhir	: " + nilaiAkhir);
    }
}

public class Nilai {
    public static void main(String[] args) {
        dataNilai mahasiswa1 = new dataNilai("08982983", "Ghiyatsi", 90, 80, 87);
        mahasiswa1.hitungNilai();
        mahasiswa1.cetakNilai();

        System.out.println();
    }
    
}
