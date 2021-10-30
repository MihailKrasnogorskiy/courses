package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier Vasya = new Courier(warehouse1);
        Picker Vova = new Picker(warehouse1);
        businessProcess(Vova);
        businessProcess(Vasya);
        System.out.println(warehouse1);
        System.out.println(Vasya.getSalary());
        System.out.println(Vova.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
