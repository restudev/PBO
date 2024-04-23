public class TestKonversiSuhu {
    public static void main(String[] args) {

        KonversiSuhu Suhuku = new KonversiSuhu();
        Suhuku.hitungKelvin(23);
        System.out.println("Suhunya : " + Suhuku.hitungKelvin(23.5f) + " K");
        KonversiSuhu Suhu = new KonversiSuhu(35);
        Suhu.inputCelcius();

        Suhu.hitungKelvin(Suhu.Celcius);
        Suhu.hitungFarhenheit(Suhu.Celcius);
        Suhu.hitungRankine(Suhu.Celcius);
        Suhu.hitungDalisle(Suhu.Celcius);
        Suhu.hitungNewton(Suhu.Celcius);
        Suhu.hitungReaumur(Suhu.Celcius);
        Suhu.hitungRomer(Suhu.Celcius);
    }
}
