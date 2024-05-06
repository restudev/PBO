package transportasi;

public class Mobil2{
    public int roda = 4;
    public int body = 1;
    public int mesin = 1;
    public void maju(){
        System.out.println("Maju .....");
    }
    public void mundur(){
        System.out.println("Mundur .....");
    }
    public void belok(){
        System.out.println("Belok.....");
    }
    public void hidup(String nama){
        System.out.println("Hidupkan Mobil : "+nama);
    }
    public void mati(String nama){
        System.out.println("Matikan Mobil : "+nama);
    }
    public void ubahGigi(String nama){
        System.out.println("Ubah Gigi Mobil : "+nama);
    }

}

