package homeworks.homework_9.order;

import static homeworks.homework_9.menu.DishType.BAR;

import homeworks.homework_9.bar.Bar;
import homeworks.homework_9.kitchen.Kitchen;
import homeworks.homework_9.menu.Dish;
import homeworks.homework_9.staff.BartenderImpl;
import homeworks.homework_9.staff.Chef;
import homeworks.homework_9.staff.ColdKitchenChef;
import homeworks.homework_9.staff.HotKitchenChef;
import homeworks.homework_9.staff.interfaces.Cook;

public class OrderProcessor {
    private Kitchen kitchen;
    private Bar bar;
    private BartenderImpl bartender;
    private Cook coldKitchenChef;
    private Cook hotKitchenChef;
    private Cook chef;

    public OrderProcessor() {
        coldKitchenChef = new ColdKitchenChef();
        hotKitchenChef = new HotKitchenChef();
        chef = new Chef();
        bartender = new BartenderImpl();
        kitchen = new Kitchen(coldKitchenChef, hotKitchenChef, chef);
        bar = new Bar(bartender);
    }

    public void processOrder(Order order) {
        for (Dish dish : order.getDishes()) {
            if (dish.getType().equals(BAR)) {
                bar.prepareCocktail(dish);
            } else {
                kitchen.prepareDish(dish);
            }
        }
        order.setReady(true);
    }
}
