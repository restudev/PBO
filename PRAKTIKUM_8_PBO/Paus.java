public class Paus extends Hewan {
    public Paus(String jenis, String ciri){
        super(jenis,ciri);
    }

    @Override
    public void suara() {
        System.out.println("Suara\t: Wuussshhhhh");
    }

    @Override
    public void berjalan() {
        System.out.println("Paus berenang");
    }

    @Override
    public void bernafas() {
        System.out.println("Paus bernafas menggunakan insang");
    }
}
