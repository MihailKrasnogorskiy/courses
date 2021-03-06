package day9.Task2;

public class Circle extends Figure {
    private double r;

    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * this.r;
    }
}
