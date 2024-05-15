public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Merah", true);

        System.out.println("Warna: " + rectangle.getColor());
        System.out.println("Tinggi: " + rectangle.getLength());
        System.out.println("Lebar: " + rectangle.getWidth());
        System.out.println("Luas: " + rectangle.getArea());
    }
}
