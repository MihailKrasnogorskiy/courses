package day6;

public class Task1 {
    public static void main(String[] args) {
Car car = new Car();
        car.setManufactureYear(2011);
        car.info();
        System.out.println(car.yearDifference(2005));
        Motorbike motorbike = new Motorbike("Kawasaki", 2020,"black");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2021));
    }
}
