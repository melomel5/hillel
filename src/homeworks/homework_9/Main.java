package homeworks.homework_9;

import homeworks.homework_9.order.OrderProcessor;
import homeworks.homework_9.staff.Waiter;

public class Main {

    public static void main(String[] args) {

        Hall hall = new Hall();
        Waiter waiter = new Waiter();
        OrderProcessor orderProcessor = new OrderProcessor();

        waiter.setHall(hall);
        hall.setWaiter(waiter);

        Customer serhii = new Customer("Serhii", hall);

        waiter.seatCustomer(serhii, 1);

        serhii.placeOrder();
        serhii.showOrder();
        orderProcessor.processOrder(serhii.getOrder());
        waiter.serveOrder(serhii.getOrder(), serhii.getTableNumber());
    }
}