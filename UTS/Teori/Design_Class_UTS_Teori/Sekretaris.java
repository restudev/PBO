public class Sekretaris extends Pegawai {
    private double upahLembur;

    Sekretaris(String nama, double gajiPokok, double upahLembur){
        super(nama, gajiPokok, "Sekretaris");
        this.upahLembur = upahLembur;
    }

    public double getUpahLembur(){
        return upahLembur;
    }

    public void setUpahLembur(double upahLembur){
        this.upahLembur = upahLembur;
    }

    public double getTotalGaji(){
        return getGajiPokok() + upahLembur;
    }

}
