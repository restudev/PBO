public class Nilai {
    public static void main(String[] args) {
        Mahasiswa nilai = new Mahasiswa();
	nilai.nim="08982983";
	nilai.nama="Ghiyatsi";
	nilai.nilaiTugas=99;
	nilai.nilaiUts=87;
	nilai.nilaiUas=98;
	nilai.hitungNilai();
	nilai.cetakNilai();

	Mahasiswa nilai2 = new Mahasiswa();
	nilai2.inputData();
	nilai2.hitungNilai();
        nilai2.cetakNilai();

        System.out.println();
    }
    
}
