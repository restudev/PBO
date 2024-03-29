public class MatematikaDemo {
    public static void main(String[] args) {

        Matematika hitung = new Matematika();
        double hsl;
        hitung.a = 99;
        hitung.b = 7;
        hitung.pertambahan();
        hitung.pengurangan();
        hitung.perkalian();
        hitung.pembagian();

        hsl = hitung.pertambahan(100, 200, 300);
        System.out.println("\n Hasil Pertambahan: " + hsl);

        hsl = hitung.perkalian(100, 200, 300);
        System.out.println("\n Hasil Perkalian: " + hsl);

    }
}