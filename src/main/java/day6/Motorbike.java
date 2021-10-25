package day6;

public class Motorbike {
    private String model;
    private int manufactureYear;
    private String colour;

    public Motorbike(String model, int manufactureYear, String colour) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getColour() {
        return colour;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - manufactureYear);
    }
}

