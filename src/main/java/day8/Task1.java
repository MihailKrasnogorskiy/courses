package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "1";
        long startTime = System.currentTimeMillis();
        for (int i = 2; i <= 20000; i++) {
            s = s + " " + i;
        }
        System.out.println(s);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime)); //396ms

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        startTime = System.currentTimeMillis();
        for (int i = 2; i <= 20000; i++) {
            sb.append(" ");
            sb.append(i);
        }
        System.out.println(sb);
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime)); //17ms
    }
}
