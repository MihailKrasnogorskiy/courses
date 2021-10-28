package day9.Task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double area = this.width * this.height;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (this.height + this.width);
        return perimeter;
    }
}
