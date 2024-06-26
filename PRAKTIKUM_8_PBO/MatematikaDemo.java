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

        System.out.println("-------------------------------------------------");

        double a = 12.5, b = 28.7, c = 14.2;
        hsl = hitung.pertambahan(a, b, c);
        System.out.println("Hasil Pertambahan " + a + " + " + b + " + " + c + " = " + hsl);
        hsl = hitung.pengurangan(a, b, c);
        System.out.println("Hasil Pengurangan " + a + " + " + b + " + " + c + " = " + hsl);
        hsl = hitung.perkalian(a, b, c);
        System.out.println("Hasil Perkalian " + a + " x " + b + " x " + c + " = " + hsl);
        hsl = hitung.pembagian(a, b, c);
        System.out.println("Hasil Pembagian " + a + " + " + b + " + " + c + " = " + hsl);

    }
}
