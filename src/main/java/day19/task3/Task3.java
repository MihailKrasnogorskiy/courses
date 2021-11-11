package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Point> mapTaxi = new HashMap<>();
        File file = new File("src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] splitLine = line.split(" ");
            int[] taxiCars = new int[splitLine.length];
            for (int i = 0; i < splitLine.length; i++) {
                taxiCars[i] = Integer.parseInt(splitLine[i]);
            }
            mapTaxi.put(taxiCars[0], new Point(taxiCars[1], taxiCars[2]));
        }
    }
}

