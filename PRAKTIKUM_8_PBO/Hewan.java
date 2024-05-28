public class Hewan {
    String jenis, ciri;

    Hewan() {}

    Hewan(String jenis, String ciri) {
        this.jenis = jenis;
        this.ciri = ciri;
    }

    public void suara() {
        System.out.println("Suara hewan");
    }

    public void berjalan() {
        System.out.println("Cara berjalan hewan");
    }

    public void bernafas() {
        System.out.println("Cara bernafas hewan");
    }
}

