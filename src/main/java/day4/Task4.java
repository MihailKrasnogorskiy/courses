package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(10000);
        }
        int max = arr[0];
        int ind = 0;
        int summ;
        for (int i = 0; i < 98; i++) {
            summ = 0;
            for (int j = 0; j < 3; j++) {
                summ = summ + arr[i + j];
            }
            if (summ > max) {
                max = summ;
                ind = i;
            }
        }
        System.out.println(max);
        System.out.println(ind);
    }
}
