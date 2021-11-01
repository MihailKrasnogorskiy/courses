package day12.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand groupA = new MusicBand("groupA", 2018, Arrays.asList("1", "2", "3"));
        MusicBand groupB = new MusicBand("groupB", 2019, Arrays.asList("4", "5"));
        MusicBand.transferMembers(groupA, groupB);
        groupB.printMembers();
        groupA.printMembers();
    }
}
