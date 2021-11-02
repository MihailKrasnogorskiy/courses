package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringNumbers = line.split(" ");
            int summ = 0;
            int counter = 0;
            for (String number : stringNumbers) {
                summ += Integer.parseInt(number);
                counter++;
            }
            if (counter != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            } else System.out.println(summ);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
