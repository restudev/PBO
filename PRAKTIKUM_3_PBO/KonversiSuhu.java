public class KonversiSuhu {

    float hasil;
    int Celcius;

    public KonversiSuhu(int Celcius){
        this.Celcius = Celcius;
    }

    public KonversiSuhu(){}

    void hitungKelvin (int Celcius){
        hasil = Celcius + 273.15f;
        System.out.println("Konversi Celcius ke Kelvin : " + hasil + " K");
    }
    void hitungFarhenheit (int Celcius){
        hasil = Celcius * 1.8f + 32;
        System.out.println("Konversi Celcius ke Farhenheit : " + hasil + " F");
    }
    void hitungRankine (int Celcius){
        hasil = Celcius * 1.8f + 491.67f;
        System.out.println("Konversi Celcius ke Rankine : " + hasil + " Ra");
    }
    void hitungDalisle (int Celcius){
        hasil = (100 - Celcius) * 1.5f;
        System.out.println("Konversi Celcius ke Dalisle : " + hasil + " De");
    }
    void hitungNewton (int Celcius){
        hasil = Celcius * 33/100;
        System.out.println("Konversi Celcius ke Newton : " + hasil + " N");
    }
    void hitungReaumur (int Celcius){
        hasil = Celcius * 0.8f;
        System.out.println("Konversi Celcius ke Reaumur : " + hasil + " R");
    }
    void hitungRomer(int Celcius){
        hasil = Celcius * 21/40 + 7.5f;
        System.out.println("Konversi Celcius ke Romer : " + hasil + " Ro");
    }
}
