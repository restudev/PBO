public class Pegawai {
    private double gajiPokok;
    private String nama;
    private String jabatan;

    Pegawai(String nama){
        this.nama = nama;
    }

    Pegawai(String nama, double gajiPokok, String jabatan){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.jabatan = jabatan;
    }

    Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getNama(){
        return nama;
    }

    public String getJabatan(){
        return jabatan;
    }

    public double getTotalGaji(){
        return gajiPokok;
    }

    public void info(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jabatan\t\t: " + jabatan);
        System.out.println("Gaji Pokok\t: " + getGajiPokok());
    }
}
