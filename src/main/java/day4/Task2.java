package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(10000);
        }
        int minNumber = 10000;
        int maxNumber = 0;
        int summ = 0;
        int tens = 0;
        for (int number : arr) {
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number % 10 == 0) {
                tens++;
                summ = summ + number;
            }
        }
        System.out.println("наибольший элемент массива: " + maxNumber);
        System.out.println("наименьший элемент массива: " + minNumber);
        System.out.println("чисел оканчивющихся на 0: " + tens);
        System.out.println("Сумма чисел оканчивющихся на 0: " + summ);
    }
}
