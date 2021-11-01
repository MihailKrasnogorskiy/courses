package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static int salaryPerOrder = 100;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private static final int BONUS_SIZE = 50000;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "Зарплата работника составляет " + salary + "; Выплата бонуса " + isPayed;
    }

    @Override
    public void doWork() {
        salary += salaryPerOrder;
        warehouse.orderDelivered();
    }

    @Override
    public void bonus() {
        if (getIsPayed() == false) {
            if (warehouse.PICKED_PLAN > warehouse.getCountDeliveredOrders()) {
                System.out.println("Бонус пока не доступен");
            } else {
                salary += BONUS_SIZE;
                isPayed = true;
            }
        } else System.out.println("Бонус уже был выплачен");
    }
}
