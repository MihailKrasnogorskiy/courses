package day6;

public class Motorbike {
    private String model;
    private int year;
    private String colour;

    public Motorbike(String model, String colour, int year) {
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public int getyear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}

