package day5;

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
}

