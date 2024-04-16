class Mhs {
    String nim, nm;
    float tgs, uts, uas;

    Mhs(float a, float b, float c) {
        tgs = a;
        uts = b;
        uas = c;
    }

    void cetak() {
        System.out.println("Nama: " + nm);
        System.out.println("Tgs: " + tgs);
        System.out.println("Uts: " + uts);
        System.out.println("Uas: " + uas);
    }

    void cetak(String s) {
        System.out.println(s);
    }
}

