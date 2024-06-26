public class TestShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Merah", true);

        System.out.println("------- Rectangle -------");
        System.out.println("Warna: " + rectangle.getColor());
        System.out.println("Tinggi: " + rectangle.getLength());
        System.out.println("Lebar: " + rectangle.getWidth());
        System.out.println("Luas: " + rectangle.getArea());
        System.out.println();

        Circle circle = new Circle(3.0, "Biru", true);

        System.out.println("------- Circle -------");
        System.out.println("Warna: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Luas: " + circle.getArea());
        System.out.println("Keliling: " + circle.getPerimeter());
        System.out.println();

        Square square = new Square(5.0, "Hijau", true);

        System.out.println("------- Square -------");
        System.out.println("Warna: " + square.getColor());
        System.out.println("Sisi: " + square.getSide());
        System.out.println("Luas: " + square.getArea());
        System.out.println("Keliling: " + square.getPerimeter());
    }
}
