package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane il = new Airplane("IL", 1985, 78, 30000);
        il.setYear(1998);
        il.setLength(95);
        il.fillUp(5000);
        il.fillUp(50000);
        il.info();
    }
}
