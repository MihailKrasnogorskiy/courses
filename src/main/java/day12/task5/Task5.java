package day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        {
            MusicBand groupA = new MusicBand("groupA", 2018, Arrays.asList(new MusicArtist("Vasua", 1983), new MusicArtist("Vova", 1986), new MusicArtist("Vika", 1985)));
            MusicBand groupB = new MusicBand("groupB", 2019, Arrays.asList(new MusicArtist("Tanya", 1987), new MusicArtist("Slava", 1989)));
            MusicBand.transferMembers(groupA, groupB);
            groupB.printMembers();
            groupA.printMembers();
        }

    }
}
