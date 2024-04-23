public class TestStatic1 {
    public static void main(String[] args) {
        TestStatic test = new TestStatic();

        test.satu(); // Memanggil method satu() dari objek test
        TestStatic.dua(); // Memanggil method dua() secara langsung dari kelas TestStatic

        // Mencetak kembali attribute a-e dari objek test
        System.out.println("Attribute a: " + test.a);
        System.out.println("Attribute b: " + TestStatic.b);
        System.out.println("Attribute c: " + test.c);
        System.out.println("Attribute d: " + test.d);
        // System.out.println("Attribute e: " + test.e); // e adalah private dan tidak bisa diakses dari luar kelas TestStatic
    }
}
