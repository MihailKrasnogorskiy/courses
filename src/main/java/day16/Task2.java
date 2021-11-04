package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        final int AMOUNT_OF_NUMBERS = 1000;
        final int GROUP_SIZE = 20;
        File file1 = new File("file1");
        PrintWriter pw1 = new PrintWriter(file1);
        Random rand = new Random();
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            pw1.print(rand.nextInt(101) + " ");
        }
        pw1.close();
        File file2 = new File("file2");
        PrintWriter pw2 = new PrintWriter(file2);
        double sum = 0.0;
        Scanner scanner = new Scanner(file1);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        for (int i = 1; i <= AMOUNT_OF_NUMBERS; i++) {
            int number = Integer.parseInt(numbers[i - 1]);
            sum += number;
            if (i % GROUP_SIZE == 0) {
                double average = sum / GROUP_SIZE;
                pw2.print(average + " ");
                sum = 0.0;
            }
        }
        scanner.close();
        pw2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        for (String x : numbers) {
            double number = Double.parseDouble(x);
            sum += number;
        }
        scanner.close();
        int result = (int) sum;
        System.out.println(result);
    }
}
