// class mobil2{
//     String warna;
//     int roda = 4;
//     int body = 1;
//     static int mesin = 1;
//     String gigi;

//     static void maju(){
//         System.out.println("Maju....");
//     }
//     void mundur(){
//         System.out.println("Mundur....");
//     }
//     void belok(){
//         System.out.println("Belok....");
//     }
//     void hidupkanMobil(){
//         System.out.println("Hidupkan Mobil	: " + warna);
//     }
//     void matikanMobil(){
//         System.out.println("Matikan Mobil	: " + warna);
//     }
//     void ubahGigi(){
//         System.out.println("Ubah Gigi Mobil	: " + warna);
//     }
// }

public class MobilDemo2 {

    public static void main(String[] args) {
        
        //membuat objek
        Mobil2 avanza = new Mobil2();
        Mobil2 xenia = new Mobil2();
        avanza.warna = "Avanza Silver";

        avanza.hidupkanMobil();
        avanza.ubahGigi();
        avanza.maju();
        avanza.mundur();
        avanza.belok();

        System.out.println("Roda  Avanza	: " +avanza.roda);
        System.out.println("Roda  Xenia	: " +xenia.roda);
        System.out.println("Mesin  Avanza	: " +avanza.mesin);
        System.out.println("Mesin  Xenia	: " +xenia.mesin);

        avanza.roda = 5;
        avanza.mesin = 9;
        System.out.println("Roda Avanza	: " + avanza.roda);
        avanza.roda = 4;
        System.out.println("Roda Xenia	: " + avanza.roda);
        System.out.println("Mesin Avanza	: " + avanza.mesin);
        System.out.println("Mesin Xenia	: " + avanza.mesin);
        System.out.println("Mesin Avanza	: " + avanza.mesin);
        System.out.println("Mesin Xenia	: " + avanza.mesin);

        avanza.matikanMobil();
    }
}
