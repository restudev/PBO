public class Mahasiswa{
    String nim;
    String nama;
    float nilaiUts, nilaiTugas, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;

    public Mahasiswa(String nim, String nama, float nilaiUts, float nilaiTugas, float nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
    }

    void hitungNilai(){
        pNilaiTugas = nilaiTugas * 0.20f;
        pNilaiUts = nilaiUts * 0.35f;
        pNilaiUas = nilaiUas * 0.45f;
        nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
    }
    
    void cetakNilai(){
        System.out.println("NIM		: " + nim);
        System.out.println("Nama		: " + nama);
        System.out.println("Nilai UTS	: " + nilaiUts +"  20%   :   " +pNilaiUts);
        System.out.println("Nilai Tugas	: " + nilaiTugas +"  35%   :   " +pNilaiTugas);
        System.out.println("Nilai UAS	: " + nilaiUas +"  45%   :   " +pNilaiUas);
        System.out.println("Nilai Akhir	: " + nilaiAkhir);
    }
}