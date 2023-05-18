package homeworks.homework_2;

public class Main {
    public static void main(String[] args) {

        homeworks.homework_2.class_1.SameName sameName1 = new homeworks.homework_2.class_1.SameName();
        System.out.println(sameName1.getClass());
        sameName1.info();

        homeworks.homework_2.class_2.SameName sameName2 = new homeworks.homework_2.class_2.SameName();
        System.out.println(sameName2.getClass());
        sameName2.info();

        Employee serhii = new Employee("Serhii", "Nikolaiev", "Mikhailovich", "Java developer", "email@email.com", "+380930000000", 32, 100000.00);
        System.out.println(serhii);

        Employee maxim = new Employee();
        System.out.println(maxim);

        Employee john = new Employee("John", "Doe", "-", "CEO", 1000000.00);
        System.out.println(john);

        Car hyundai = new Car();
        hyundai.start();
    }
}
