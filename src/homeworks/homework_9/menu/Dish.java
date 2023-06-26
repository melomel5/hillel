package homeworks.homework_9.menu;

public class Dish {
    private String name;
    private double price;
    private DishType type;

    public Dish(String name, double price, DishType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public DishType getType() {
        return type;
    }
}
