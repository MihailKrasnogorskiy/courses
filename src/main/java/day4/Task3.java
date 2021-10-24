package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        Random rand = new Random();
        int max = 0;
        int ind = 0;
        for (int m = 0; m < 12; m++) {
            int summ = 0;
            for (int n = 0; n < 8; n++) {
                arr[m][n] =rand.nextInt(50);
                summ = summ + arr[m][n];
            }
            if (summ > max) {
                max = summ;
                ind = m;
            }
        }
        System.out.println(max);
        System.out.println(ind);
    }
}
