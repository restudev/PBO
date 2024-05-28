public class Paus extends Hewan {
    Paus(String jenis, String ciri) {
        super(jenis, ciri);
    }

    @Override
    public void suara() {
        System.out.println("Suara\t: Wuhshshshs");
    }

    @Override
    public void berjalan() {
        System.out.println("Paus berenang dengan sirip");
    }

    @Override
    public void bernafas() {
        System.out.println("Paus bernafas menggunakan paru-paru");
    }
}
