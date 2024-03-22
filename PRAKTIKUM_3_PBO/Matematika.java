public class Matematika {     

    float hasil;
    float a, b;

    public Matematika(float a, float b){
        this.a = a;
        this.b = b;
    }

    public Matematika(){}

    void pertambahan (float a, float b) {
        hasil = a + b;
        System.out.println("\n Hasil Pertambahan: " + a + " + " + b + " = " + hasil);
    }
    void pengurangan (float a, float b) {
        hasil = a - b;
        System.out.println("\n Hasil Pengurangan: " + a + " - " + b + " = " + hasil);
    }
    void perkalian (float a, float b) {
        hasil = a * b;
        System.out.println("\n Hasil Perkalian: " + a + " x " + b + " = " + hasil);
    }
    void pembagian (float a, float b) {
        hasil = a / b;
        System.out.println("\n Hasil Pembagian: " + a + " : " + b + " = " + hasil);
    }
}
