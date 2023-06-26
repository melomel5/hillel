package homeworks.homework_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import homeworks.homework_9.menu.Dish;
import homeworks.homework_9.menu.RestaurantMenu;

public class Customer {

    private String name;
    private List<Dish> order;
    private int tableNumber;

    public Customer(String name) {
        this.name = name;
        this.order = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of dishes you want to order:");
        int quantity = scanner.nextInt();
        RestaurantMenu menu = new RestaurantMenu();
        menu.showMenu();

        for (int i = 1; i <= quantity; i++) {
            System.out.print("Input the name of the dish #" + i + ": ");
            String dishName = scanner.next();

            Dish dish = menu.getDishByName(dishName);
            if (dish != null) {
                order.add(dish);
            } else {
                System.out.println("Invalid dish name. Please try again.");
                i--;
            }
        }

        scanner.close();
    }

    public void showOrder() {
        for (Dish orderElement : order) {
            System.out.println(orderElement.getName());
        }
    }

    public List<Dish> getOrder() {
        return order;
    }
}
