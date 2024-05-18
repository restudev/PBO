package latihan3;

public class MebelDemo {
    public static void main(String[] args) {
        MejaMakan mm = new MejaMakan();
        mm.harga = 12000000;
        mm.bahan = "Kayu Rusia";
        mm.jmlKaki = 4;
        mm.jmlKursi = 4;
        System.out.println("----- Meja Makan -----");
        System.out.println("Bahan\t\t: "+mm.bahan);
        System.out.println("harga\t\t: "+mm.harga);
        System.out.println("Jumlah Kursi\t: "+mm.jmlKursi);
        System.out.println("Jumlah Kaki\t: "+mm.jmlKaki);
        System.out.println("Harga\t\t: "+mm.harga);
        
        MejaTamu mt = new MejaTamu();
        mt.harga = 36900000;
        mt.bahan = "Sutra Belanda";
        mt.jmlKaki = 10;
        mt.bentukKaca = "Polygon";
        System.out.println("----- Meja Tamu -----");
        System.out.println("Bahan\t\t: "+mt.bahan);
        System.out.println("harga\t\t: "+mt.harga);
        System.out.println("Bentuk Kaca\t: "+mt.bentukKaca);
        System.out.println("Jumlah Kaki\t: "+mt.jmlKaki);
        System.out.println("Harga\t\t: "+mt.harga);
        mt.discount(mt.harga);
        
        AlmariMakan am = new AlmariMakan();
        am.harga = 41850000;
        am.bahan = "Kayu Moldova";
        am.roda = true;
        am.jmlRoda = 8;
        System.out.println("----- Almari Makan -----");
        System.out.println("Bahan\t\t: "+am.bahan);
        System.out.println("harga\t\t: "+am.harga);
        System.out.println("Jumlah Roda\t: "+am.jmlRoda);
        System.out.println("Harga\t\t: "+am.harga);
        am.discount(am.harga);
        
        AlmariPakaian ap = new AlmariPakaian();
        ap.harga = 98900000;
        ap.bahan = "Kayu Amerika";
        ap.roda = false;
        ap.jmlPintu = 16;
        System.out.println("----- Almari Pakaian -----");
        System.out.println("Bahan\t\t: "+ap.bahan);
        System.out.println("harga\t\t: "+ap.harga);
        System.out.println("Jumlah Pintu\t: "+ap.jmlPintu);
        System.out.println("Harga\t\t: "+ap.harga);
        ap.discount(ap.harga);
    }
}

