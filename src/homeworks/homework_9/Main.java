package homeworks.homework_9;

import homeworks.homework_9.kitchen.Kitchen;
import homeworks.homework_9.staff.Bartender;
import homeworks.homework_9.staff.Chef;
import homeworks.homework_9.staff.ColdKitchenChef;
import homeworks.homework_9.staff.HotKitchenChef;
import homeworks.homework_9.staff.Waiter;
import homeworks.homework_9.staff.interfaces.Cook;

public class Main {

    public static void main(String[] args) {
        Cook coldKitchenChef = new ColdKitchenChef();
        Cook hotKitchenChef = new HotKitchenChef();
        Cook bartender = new Bartender();
        Cook chef = new Chef();
        Kitchen kitchen = new Kitchen(coldKitchenChef, hotKitchenChef, bartender, chef);

        Hall hall = new Hall();
        Waiter waiter = new Waiter(hall);

        Customer serhii = new Customer("Serhii", hall);

        waiter.seatCustomer(serhii, 1);

        serhii.placeOrder();
        serhii.showOrder();

        kitchen.prepareOrder(serhii.getOrder());
        waiter.serveOrder(serhii.getOrder(), serhii.getTableNumber());
    }
}
