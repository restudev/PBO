public class Manajer extends Pegawai {
    private double bonus;

    Manajer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok, "Manajer");
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getTotalGaji(){
        return getGajiPokok() + bonus;
    }
}