package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;

    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public String toString() {
        return name + ", " + year + " год основания";
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        List<String> transfer = new ArrayList<>(bandA.getMembers());
        transfer.addAll(bandB.getMembers());
        bandB.setMembers(transfer);
        bandA.setMembers(new ArrayList<>());
    }
}
