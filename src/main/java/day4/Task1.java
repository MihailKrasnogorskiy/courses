package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] =rand.nextInt(9) + 1;
        }
        int more8 = 0;
        int ones = 0;
        int even = 0;
        int summ = 0;
        for (int number : arr) {
            if (number > 8) {
                more8++;
            }
            if (number == 1) {
                ones++;
            }
            if (number % 2 == 0) {
                even++;
            }
            summ = summ + number;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + l);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + ones);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + (l - even));
        System.out.println("Сумма всех элементов массива: " + summ);
    }
}