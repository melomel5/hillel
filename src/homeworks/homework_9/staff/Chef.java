package homeworks.homework_9.staff;

import java.util.List;

import homeworks.homework_9.staff.interfaces.Cook;

public class Chef extends Staff implements Cook {

    @Override
    public void cook(String dishName, List<String> ingredients) {
        System.out.println("Chef is cooking " + dishName);
        System.out.println("Ingredients: " + ingredients);
    }
}
