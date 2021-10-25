package day6;

public class Car {
    private String model;
    private int manufactureYear;
    private String colour;

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setColour(String colour) {
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
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - manufactureYear);
    }
}
