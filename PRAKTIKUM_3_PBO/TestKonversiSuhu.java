public class TestKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();
        float Celcius = 30f;

        // System.out.println("Celcius : " + Celcius);
        // System.out.println("Konversi Celcius ke Kelvin : " + konversi.Kelvin(Celcius));
        // System.out.println("Konversi Celcius ke Farhenheit : " + konversi.Farhenheit(Celcius));
        // System.out.println("Konversi Celcius ke Rankine : " + konversi.Rankine(Celcius));
        // System.out.println("Konversi Celcius ke Dalisle : " + konversi.Delisle(Celcius));
        // System.out.println("Konversi Celcius ke Newton : " + konversi.Newton(Celcius));
        // System.out.println("Konversi Celcius ke Reaumur : " + konversi.Reaumur(Celcius));
        // System.out.println("Konversi Celcius ke Romer : " + konversi.Romer(Celcius));

        konversi.hitungKelvin(Celcius);
        konversi.hitungFarhenheit(Celcius);
        konversi.hitungRankine(Celcius);
        konversi.hitungDalisle(Celcius);
        konversi.hitungNewton(Celcius);
        konversi.hitungReaumur(Celcius);
        konversi.hitungRomer(Celcius);
    }
}
