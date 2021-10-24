package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Honda", 2020, "yellow");
        System.out.print(motorbike.getModel() + " ");
        System.out.print(motorbike.getManufactureYear() + " ");
        System.out.println(motorbike.getColour());
    }
}