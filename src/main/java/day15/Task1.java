package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Task1 {
    public static void main(String[] args) {
        File readFile = new File("src/main/resources/shoes.csv");
        File writeFile = new File("src/main/java/day15/stock_balance");
        try {
            Scanner scanner = new Scanner(readFile);
            PrintWriter pw = new PrintWriter(writeFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] stockBalances = line.split(";");
                int size = Integer.parseInt(stockBalances[1]);
                if (stockBalances.length != 3 || size == 0) throw new DataFormatException();
                int balance = Integer.parseInt(stockBalances[2]);
                if (balance == 0) {
                    pw.println(line.replaceAll(";", ", "));
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Входной файл не найден");
        } catch (DataFormatException e) {
            System.out.println("Неверный формат файла. Необходим разделитель ;  и количестов столбцов - 3 (Наименование; размер; остаток)");
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат файла. Необходим разделитель ;  и количестов столбцов - 3 (Наименование; размер; остаток)");
        }


    }
}
