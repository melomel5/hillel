package homeworks.homework_9.staff;

import homeworks.homework_9.staff.interfaces.Cook;

public class HotKitchenChef extends Staff implements Cook {

    @Override
    public void cook(String dishName) {
        System.out.println("Hot Kitchen Chef is cooking" + dishName);
    }
}
