package homeworks.homework_9;

import java.util.ArrayList;
import java.util.List;

import homeworks.homework_9.kitchen.Kitchen;
import homeworks.homework_9.menu.Dish;

public class Order {
    private List<Dish> dishes;

    public Order() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void processOrder(Kitchen kitchen) {
        for (Dish dish : dishes) {
            kitchen.prepareDish(dish);
        }
    }
}
