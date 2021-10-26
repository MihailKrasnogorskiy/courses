package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player(100 -rand.nextInt(11));
        System.out.println(player1.getStamina());
//        Player.info();
        Player player2 = new Player(100 -rand.nextInt(11));
//        Player.info();
        Player player3 = new Player(100 -rand.nextInt(11));
//        Player.info();
        Player player4 = new Player(100 -rand.nextInt(11));
//        Player.info();
        Player player5 = new Player(100 -rand.nextInt(11));
//        Player.info();
        Player player6 = new Player(100 -rand.nextInt(11));
//        Player.info();
        Player player7 = new Player(100 -rand.nextInt(11));
//        Player.info();
         for (int i=1; i<=101; i++) {
             player1.run();
             System.out.println(player1.getStamina());
             Player.info();
         }
    }
}
