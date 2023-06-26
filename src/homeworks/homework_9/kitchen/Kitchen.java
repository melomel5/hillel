package homeworks.homework_9.kitchen;

import java.util.List;

import homeworks.homework_9.menu.Dish;
import homeworks.homework_9.staff.interfaces.Cook;

public class Kitchen {
    private Cook coldKitchenChef;
    private Cook hotKitchenChef;
    private Cook bartender;
    private Cook chef;

    public Kitchen(Cook coldKitchenChef, Cook hotKitchenChef, Cook bartender, Cook chef) {
        this.coldKitchenChef = coldKitchenChef;
        this.hotKitchenChef = hotKitchenChef;
        this.bartender = bartender;
        this.chef = chef;
    }

    public void prepareDish(Dish dish) {
        switch (dish.getType()) {
        case COLD, DESSERT:
            coldKitchenChef.cook(dish.getName(), dish.getIngredients());
            break;
        case HOT:
            hotKitchenChef.cook(dish.getName(), dish.getIngredients());
            break;
        case BAR:
            bartender.cook(dish.getName(), dish.getIngredients());
            break;
        case UNKNOWN:
            chef.cook(dish.getName(), dish.getIngredients());
            break;
        default:
            System.out.println("Invalid dish type.");
        }
    }

    public void prepareOrder(List<Dish> order) {
        for (Dish dish : order) {
            prepareDish(dish);
        }
    }
}
