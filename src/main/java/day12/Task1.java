package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("Lada");
        auto.add("Renault");
        auto.add("BMV");
        auto.add("GMC");
        auto.add("FAW");
        System.out.println(auto);
        auto.add(2, "Mercedes");
        System.out.println(auto);
        auto.remove(0);
        System.out.println(auto);
    }
}
