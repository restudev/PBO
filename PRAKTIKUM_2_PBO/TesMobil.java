class Mobil {

    int roda = 4;
    int body = 1;
    static int mesin = 1; 
    static void maju(){
        System.out.println("Maju....");
    }
    void mundur(){
        System.out.println("Mundur....");
    }
    void belok(){
        System.out.println("Belok....");
    }
}


public class TesMobil {
    public static void main(String[] args) {
        Mobil avanza = new Mobil();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda  : " +avanza.roda);
        System.out.println("Mesin  : " +avanza.mesin);

    }
}
