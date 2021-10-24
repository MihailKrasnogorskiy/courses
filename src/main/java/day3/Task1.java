package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String city = scanner.nextLine();
            if (city.equals("Stop")) {
                break;
            }
            switch (city) {
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Кёльн":
                case "Мюнхен":
                case "Берлин":
                    System.out.println("Германия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
            }


        }
    }
}
