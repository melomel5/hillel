package homeworks.homework_9.menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {

    private List<Dish> menu = new ArrayList<>();
    private static final String MENU_FILE_PATH = "src/homeworks/homework_9/menu/menu.csv";

    public RestaurantMenu() {
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(MENU_FILE_PATH))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] dishData = line.split(csvSplitBy);
                String name = dishData[0].trim();
                double price = Double.parseDouble(dishData[1].replaceAll("[^0-9.]", ""));
                DishType type = getDishType(dishData[2]);

                Dish dish = new Dish(name, price, type);
                menu.add(dish);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showMenu() {
        for (Dish dish : menu) {
            System.out.println(dish.getName() + " - " + dish.getPrice());
        }
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public Dish getDishByName(String name) {
        for (Dish dish : menu) {
            if (dish.getName().equalsIgnoreCase(name)) {
                return dish;
            }
        }
        return null;
    }

    private DishType getDishType(String typeString) {
        try {
            return DishType.valueOf(typeString.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown dish type: " + typeString);
            return DishType.UNKNOWN;
        }
    }
}
