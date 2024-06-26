package latihan2;

public class Zoo3Abstract {
    static void test(Binatang a){
        a.makan();
        a.tidur();
        a.mati();
    }
    public static void main(String[] args) {
        Harimau macan = new Harimau();
        Bebek donald = new Bebek();

        // Binatang b = new Binatang(); -> error abstract class tidak bisa dibuat objek

        test(macan);
        test(donald);
    }
}
