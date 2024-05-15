public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        math.pertambahan(20, 20);
        math.pengurangan(10, 5);
        math.perkalian(10, 20);
        math.pembagian(20, 2);

        System.out.println("-------------------------------------------------");

        math.pertambahan(12.5, 28.7, 14.2);
        math.pengurangan(12.5, 28.7, 14.2);
        math.perkalian(12.5, 28.7, 14.2);
        math.pembagian(12.5, 28.7, 14.2);
    }
}
