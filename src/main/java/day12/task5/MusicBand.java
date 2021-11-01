package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String name;
    int year;
    List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;

    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public String toString() {
        return name + ", " + year + " год основания";
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        List<MusicArtist> transfer = new ArrayList<>(bandA.getMembers());
        transfer.addAll(bandB.getMembers());
        bandB.setMembers(transfer);
        bandA.setMembers(new ArrayList<>());
    }
}
