package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;
    public static final int PICKEDPLAN = 10000;
    public static final int DELIVEREDPLAN = 10000;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public String toString() {
        return "Количество собранных заказов " + countPickedOrders + "; Количество доставленных заказов " + countDeliveredOrders;
    }

    public void orderPicked() {
        countPickedOrders++;
    }

    public void orderDelivered() {
        countDeliveredOrders++;
    }
}
