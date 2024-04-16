public class Matematika {

    float hasil;
    float a, b;

    public Matematika(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Matematika() {
    }

    void pertambahan() {
        hasil = a + b;
        System.out.println("\n Hasil Pertambahan: " + a + " + " + b + " = " + hasil);
    }

    void pengurangan() {
        hasil = a - b;
        System.out.println("\n Hasil Pengurangan: " + a + " - " + b + " = " + hasil);
    }

    void perkalian() {
        hasil = a * b;
        System.out.println("\n Hasil Perkalian: " + a + " x " + b + " = " + hasil);
    }

    void pembagian() {
        hasil = a / b;
        System.out.println("\n Hasil Pembagian: " + a + " : " + b + " = " + hasil);
    }

    double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    double perkalian(double a, double b, double c) {
        return a * b * c;
    }
}
