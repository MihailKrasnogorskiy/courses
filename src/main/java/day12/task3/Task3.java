package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Creed", 1994));
        musicBands.add(new MusicBand("Weezer", 1992));
        musicBands.add(new MusicBand("The Offspring", 1984));
        musicBands.add(new MusicBand("Goo Goo Dolls", 1986));
        musicBands.add(new MusicBand("Matchbox Twenty", 1996));
        musicBands.add(new MusicBand("One Direction", 2010));
        musicBands.add(new MusicBand("Oblivion Machine", 2005));
        musicBands.add(new MusicBand("Team Syachihoko", 2011));
        musicBands.add(new MusicBand("Starsailor", 2000));
        musicBands.add(new MusicBand("Animal Alpha", 2002));
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
