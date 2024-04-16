public class Mobil2{
    String warna;
    int roda = 4;
    int body = 1;
    static int mesin = 1;
    String gigi;

    static void maju(){
        System.out.println("Maju....");
    }
    void mundur(){
        System.out.println("Mundur....");
    }
    void belok(){
        System.out.println("Belok....");
    }
    void hidupkanMobil(){
        System.out.println("Hidupkan Mobil	: " + warna);
    }
    void matikanMobil(){
        System.out.println("Matikan Mobil	: " + warna);
    }
    void ubahGigi(){
        System.out.println("Ubah Gigi Mobil	: " + warna);
    }
}