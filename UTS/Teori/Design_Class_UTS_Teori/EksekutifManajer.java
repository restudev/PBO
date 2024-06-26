public class EksekutifManajer extends Manajer{
    private Sekretaris mySekretaris;

    EksekutifManajer(String nama, double gajiPokok, double bonus){
        super(nama, gajiPokok, bonus);
    }

    public Sekretaris getSekretaris(){
        return mySekretaris;
    }

    public void setSekretaris(Sekretaris sekr){
        this.mySekretaris = sekr;
    }

    public double getTotalGaji(){
        return super.getTotalGaji();
    }

    public void info(){
        super.info();
        System.out.println("Bonus\t\t: " + getBonus());
        System.out.println("TotalGaji\t: " + getTotalGaji());
    }    
    
}
