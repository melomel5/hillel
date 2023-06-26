package homeworks.homework_9.staff;

import homeworks.homework_9.staff.interfaces.Cook;

public class Bartender extends Staff implements Cook {

    @Override
    public void cook(String dishName) {
        System.out.println("Bartender is cooking " + dishName);
    }
}
