package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Lada");
        car.setManufactureYear(2011);
        car.setColour("green");
        System.out.print(car.getModel() + " ");
        System.out.print(car.getManufactureYear() + " ");
        System.out.println(car.getColour());
    }
}

