package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(756777767));
    }

    public static int count7(int number) {

        if (number == 0) return 0;
        if (number / 10 >= 0 && number % 10 == 7) return 1 + count7(number / 10);
        else return 0 + count7(number / 10);
    }
}
