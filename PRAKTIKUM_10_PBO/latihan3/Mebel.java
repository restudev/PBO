package latihan3;

public class Mebel {
    int harga;
    String bahan;
}

interface Discountable {
    public void discount(int harga);
}

class Meja extends Mebel {
    int jmlKaki;
}

class MejaMakan extends Meja {
    int jmlKursi;
}

class MejaTamu extends Meja implements Discountable{
    String bentukKaca;

    public void discount(int harga) {
        float discount = harga*0.1f;
        System.out.println("Discount\t: " + discount);
    }
}

class Almari extends Mebel {
    boolean roda;
}

class AlmariMakan extends Almari implements Discountable{
    int jmlRoda;

    public void discount(int harga) {
        float discount = harga*0.15f;
        System.out.println("Discount\t: " + discount);
    }
}

class AlmariPakaian extends Almari implements Discountable {
    int jmlPintu;

    public void discount(int harga) {
        float discount = harga*0.2f;
        System.out.println("Discount\t: " + discount);
    }
}