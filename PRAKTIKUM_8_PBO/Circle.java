class Circle extends Shape {
    double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * 2;
    }

    public double getPerimeter() {
        return radius * radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}