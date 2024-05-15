public class Lebah extends Hewan {
    Lebah(String jenis, String ciri) {
        super(jenis, ciri);
    }

    @Override
    public void suara() {
        System.out.println("Suara\t: Ngingngng");
    }

    public void berjalan() {
        System.out.println("Lebah terbang");
    }

    public void bernafas() {
        System.out.println("Lebah bernafas menggunakan trakea");
    }
}
