package day12.task5;

public class MusicArtist {
    private String name;
    private int year;

    public MusicArtist(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return name + " " + year + " года рождения";
    }
}
