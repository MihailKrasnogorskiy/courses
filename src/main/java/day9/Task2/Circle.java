package day9.Task2;

public class Circle extends Figure {
    private double r;

    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }



    @Override
    public double area() {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = Math.PI * 2 * this.r;
        return perimeter;
    }
}
