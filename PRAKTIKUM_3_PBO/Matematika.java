public class Matematika {
    // float pertambahan(float a, float b){
    //     return a + b;
    // }
    // float pengurangan(float a, float b){
    //     return a - b;
    // } 
    // float perkalian(float a, float b){
    //     return a * b;
    // } 
    // float pembagian(float a, float b){
    //     return a / b;
    // }     

    float tambah = 0;
    float kurang = 0;
    float kali = 0;
    float bagi = 0;
    float a, b;

    void pertambahan (float a, float b) {
        tambah = a + b;
        System.out.println("\n Hasil Pertambahan: " + a + " + " + b + " = " + tambah);
    }
    void pengurangan (float a, float b) {
        kurang = a - b;
        System.out.println("\n Hasil Pengurangan: " + a + " - " + b + " = " + kurang);
    }
    void perkalian (float a, float b) {
        kali = a * b;
        System.out.println("\n Hasil Perkalian: " + a + " x " + b + " = " + kali);
    }
    void pembagian (float a, float b) {
        bagi = a / b;
        System.out.println("\n Hasil Pembagian: " + a + " : " + b + " = " + bagi);
    }
}
