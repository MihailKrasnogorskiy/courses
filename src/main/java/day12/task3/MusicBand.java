package day12.task3;

public class MusicBand {
    String name;
    int year;

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return name + ", " + year + " год основания";
    }
}
