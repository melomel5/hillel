package homeworks.homework_9;

import java.util.ArrayList;
import java.util.List;

import homeworks.homework_9.kitchen.Kitchen;
import homeworks.homework_9.menu.Dish;

public class Order {

    private boolean ready;
    private List<Dish> dishes;

    public Order() {
        dishes = new ArrayList<>();
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void processOrder(Kitchen kitchen) {
        for (Dish dish : dishes) {
            kitchen.prepareDish(dish);
        }
    }
}
