public class Singa extends Hewan {
    Singa(String jenis, String ciri) {
        super(jenis, ciri);
    }

    @Override
    public void suara() {
        System.out.println("Suara\t: Raaawwrrr");
    }

    @Override
    public void berjalan() {
        System.out.println("Singa berjalan dengan empat kaki");
    }

    @Override
    public void bernafas() {
        System.out.println("Singa bernafas menggunakan paru-paru");
    }
}