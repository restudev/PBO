public class Lebah extends Hewan {
    Lebah(String jenis, String ciri) {
        super(jenis, ciri);
    }

    @Override
    public void suara() {
        System.out.println("Suara\t: Dengung");
    }

    @Override
    public void berjalan() {
        System.out.println("Lebah terbang dengan sayap kecil");
    }

    @Override
    public void bernafas() {
        System.out.println("Lebah bernafas menggunakan trakea");
    }
}
