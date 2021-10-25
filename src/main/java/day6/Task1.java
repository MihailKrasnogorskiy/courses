package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2011);
        car.info();
        System.out.println(car.yearDifference(2005));
        Motorbike motorbike = new Motorbike("Kawasaki", "black", 2020);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2021));
    }
}
