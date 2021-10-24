package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(10000);
        }
        int max = 0;
        int ind = 0;
        for (int i = 1; i < 99; i++) {
            int summ = arr[i - 1] + arr[i] + arr[i + 1];
            if (summ > max) {
                max = summ;
                ind = i - 1;
            }
        }
        System.out.println(max);
        System.out.println(ind);
    }
}
