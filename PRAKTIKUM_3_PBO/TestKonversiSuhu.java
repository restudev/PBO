public class TestKonversiSuhu {
    public static void main(String[] args) {

        KonversiSuhu Suhu = new KonversiSuhu(36);
        Suhu.hitungKelvin(Suhu.Celcius);
        Suhu.hitungFarhenheit(Suhu.Celcius);
        Suhu.hitungRankine(Suhu.Celcius);
        Suhu.hitungDalisle(Suhu.Celcius);
        Suhu.hitungNewton(Suhu.Celcius);
        Suhu.hitungReaumur(Suhu.Celcius);
        Suhu.hitungRomer(Suhu.Celcius);
    }
}
