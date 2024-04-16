public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Merah");
        rectangle.setWidth(5.0); 
        rectangle.setLength(10.0); 

        System.out.println("Warna: " + rectangle.getColor());
        System.out.println("Tinggi: " + rectangle.getLength());
        System.out.println("Lebar: " + rectangle.getWidth());
        System.out.println("Luas: " + rectangle.getArea());
    }
}
