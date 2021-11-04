package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file");
        printResult(file);
    }

    public static void printResult(File file) {
        final String DOUBLE_FORMAT = "#0.000";
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double sum = 0.0;
            for (String x : numbers) {
                int a = Integer.parseInt(x);
                sum += a;
            }
            double average = sum / numbers.length;
            String formattedDouble = new DecimalFormat(DOUBLE_FORMAT).format(average);

            System.out.print(average + " --> " + formattedDouble);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат файла");
        }
    }
}

