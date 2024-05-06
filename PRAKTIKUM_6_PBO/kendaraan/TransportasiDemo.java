import transportasi.Bicycle;
import transportasi.Mobil2;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil2 avanza = new Mobil2();
        Bicycle sepeda = new Bicycle();

        System.out.println("Jumlah Roda: " + avanza.roda);
        System.out.println("Jumlah Mesin: " + avanza.mesin);
        avanza.hidup("Avanza Silver");
        avanza.ubahGigi("Xenia");
        avanza.maju();
        avanza.mundur();
        avanza.belok();

        sepeda.changeGear(5);
        sepeda.speedUp(4);
    }
}
