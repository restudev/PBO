public class Singa extends Hewan {
    public Singa(String jenis, String ciri){
        super(jenis,ciri);
    }

    @Override
    public void suara() {
        System.out.println("Suara\t: Rawrrrrr");
    }

    @Override
    public void berjalan() {
        System.out.println("Singa Berjalan dengan empat kaki");
    }

    @Override
    public void bernafas() {
        System.out.println("Singa bernafas menggunakan paru-Paru");
    }
}
