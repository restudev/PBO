public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        // Eksekusi method dan menampilkan hasilnya
        float a = 20, b = 20;
        System.out.println("Hasil Pertambahan: " + a + " + " + b + " = " + matematika.pertambahan(a, b));

        a = 10;
        b = 5;
        System.out.println("Hasil Pengurangan: " + a + " - " + b + " = " + matematika.pengurangan(a, b));

        a = 10;
        b = 20;
        System.out.println("Hasil Perkalian: " + a + " x " + b + " = " + matematika.perkalian(a, b));

        a = 20;
        b = 2;
        System.out.println("Hasil Pembagian: " + a + " / " + b + " = " + matematika.pembagian(a, b));
    }
}