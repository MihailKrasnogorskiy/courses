package day6;

public class Car {
    private String model;
    private int year;
    private String colour;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColour(String colour) {
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
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
