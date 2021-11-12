package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Point> mapTaxi = new HashMap<>();
        Set<Point> pointSet = new HashSet<>();
        int[] coordinatesSquare = new int[4];
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
        coordinatesSquare = validationSquare();
        for (int i = coordinatesSquare[0] + 1; i < coordinatesSquare[2]; i++) {
            for (int j = coordinatesSquare[1]; j < coordinatesSquare[3]; j++) {
                pointSet.add(new Point(i, j));
            }
        }
        Set<Point> taxiSet = new HashSet<>(mapTaxi.values());
        pointSet.retainAll(taxiSet);
        for (Map.Entry entry : mapTaxi.entrySet()) {
            if (pointSet.contains(entry.getValue())) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("Количество машин внутри квадрата равно " + pointSet.size());
    }


    public static int[] validationSquare() {
        int[] coordinatesSquare = new int[4];
        while (true) {
            System.out.println("Введите кооринаты противоположных вершин квадрата(x1, y1, x2, y2)");
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                coordinatesSquare[i] = scanner.nextInt();
            }
            int a = Math.abs(coordinatesSquare[0] - coordinatesSquare[2]);
            int b = Math.abs(coordinatesSquare[1] - coordinatesSquare[3]);
            if (a == b & a != 0) {
                if (coordinatesSquare[2] < coordinatesSquare[0]) {
                    int x = coordinatesSquare[0];
                    coordinatesSquare[0] = coordinatesSquare[2];
                    coordinatesSquare[2] = x;
                }
                if (coordinatesSquare[3] < coordinatesSquare[1]) {
                    int x = coordinatesSquare[1];
                    coordinatesSquare[1] = coordinatesSquare[3];
                    coordinatesSquare[3] = x;
                }
                return coordinatesSquare;
            } else System.out.println("Это не квадрат");
        }
    }
}

