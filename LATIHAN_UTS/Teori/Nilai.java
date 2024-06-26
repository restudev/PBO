class Nilai extends Mhs {
    float na, bonus;

    Nilai(float l, float m, float n, float o) {
        super(l, m, n);
        na = 0;
        bonus = 0;
    }

    void cetak() {
        super.cetak("Mahasiswa");
        super.cetak();
    }

    void cetak(String x) {
        System.out.println(x);
        System.out.println("Nim = " + super.nim);
        System.out.println("Nama = " + super.nm);
        System.out.println("Tgs = " + tgs);
        System.out.println("Uts = " + uts);
        System.out.println("Uas = " + uas);
        System.out.println("NA = " + na);
    }

    public static void main(String[] args) {
        Nilai n = new Nilai(95, 95, 90, 2);
        n.nim = "A11";
        n.nm = "Najwa";
        n.na = (n.tgs + n.uts + n.uas) / 3;
        n.na = n.na + n.bonus;
        n.cetak();
        n.cetak("Nilai");
    }
}
