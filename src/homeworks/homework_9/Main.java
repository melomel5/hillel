package homeworks.homework_9;

import java.io.IOException;

import homeworks.homework_9.kitchen.Kitchen;
import homeworks.homework_9.staff.Bartender;
import homeworks.homework_9.staff.Chef;
import homeworks.homework_9.staff.ColdKitchenChef;
import homeworks.homework_9.staff.HotKitchenChef;
import homeworks.homework_9.staff.interfaces.Cook;

public class Main {

    public static void main(String[] args) throws IOException {

        Cook coldKitchenChef = new ColdKitchenChef();
        Cook hotKitchenChef = new HotKitchenChef();
        Cook bartender = new Bartender();
        Cook chef = new Chef();

        Kitchen kitchen = new Kitchen(coldKitchenChef, hotKitchenChef, bartender, chef);


        Customer serhii = new Customer("Serhii");
        serhii.placeOrder();
        serhii.showOrder();

        kitchen.prepareOrder(serhii.getOrder());
    }

}
