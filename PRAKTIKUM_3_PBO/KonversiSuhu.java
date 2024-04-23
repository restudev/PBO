import java.util.Scanner;

public class KonversiSuhu {

    float hasil;
    int Celcius;

    Scanner key = new Scanner(System.in);

    public KonversiSuhu() {
    }

    public KonversiSuhu(int Celcius) {
        this.Celcius = Celcius;
    }

    void inputCelcius() {
        System.out.print("Input Cecius: ");
        Celcius = key.nextInt();
    }

    void hitungKelvin(int Celcius) {
        hasil = Celcius + 273.15f;
        System.out.println("Konversi Celcius ke Kelvin	: " + hasil + " K");
    }

    float hitungKelvin(float Cecius) {
        return Celcius + 273.15f;
    }

    void hitungFarhenheit(int Celcius) {
        hasil = Celcius * 1.8f + 32;
        System.out.println("Konversi Celcius ke Farhenheit	: " + hasil + " F");
    }

    float hitungFarhenheit(float Celcius) {
        return Celcius * 1.8f + 32;
    }

    void hitungRankine(int Celcius) {
        hasil = Celcius * 1.8f + 491.67f;
        System.out.println("Konversi Celcius ke Rankine	: " + hasil + " Ra");
    }

    float hitungRankine(float Celcius) {
        return Celcius * 1.8f + 491.67f;
    }

    void hitungDalisle(int Celcius) {
        hasil = (100 - Celcius) * 1.5f;
        System.out.println("Konversi Celcius ke Dalisle	: " + hasil + " De");
    }

    float hitungDalisle(float Celcius) {
        return (100 - Celcius) * 1.5f;
    }

    void hitungNewton(int Celcius) {
        hasil = Celcius * 33 / 100;
        System.out.println("Konversi Celcius ke Newton	: " + hasil + " N");
    }

    float hitungNewton(float Celcius) {
        return Celcius * 33 / 100;
    }

    void hitungReaumur(int Celcius) {
        hasil = Celcius * 0.8f;
        System.out.println("Konversi Celcius ke Reaumur	: " + hasil + " R");
    }

    float hitungReaumur(float Celcius) {
        return Celcius * 0.8f;
    }

    void hitungRomer(int Celcius) {
        hasil = Celcius * 21 / 40 + 7.5f;
        System.out.println("Konversi Celcius ke Romer	: " + hasil + " Ro");
    }

    float hitungRomer(float Celcius) {
        return Celcius * 21 / 40 + 7.5f;
    }
}
