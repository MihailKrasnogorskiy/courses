package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int n) {
        if (numbers.length == n) {
            return 0;
        } else return numbers[n] + recursionSum(numbers, n + 1);
    }
}
