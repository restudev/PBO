public class TesMobil{
    public static void main(String[] args){
        Mobil avanza = new Mobil();
        Mobil xenia = new Mobil();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda    : "+avanza.roda);
        System.out.println("Mesin   : "+avanza.mesin);
        xenia.mundur();
        xenia.belok();
        xenia.maju();
        xenia.roda = 6;
        xenia.mesin = 2;
        System.out.println("Roda    : "+xenia.roda);
        System.out.println("Mesin   : "+xenia.mesin);
    }
}