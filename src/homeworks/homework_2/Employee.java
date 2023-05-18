package homeworks.homework_2;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;
    private double salary;

    //default constructor
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.patronymic = "";
        this.position = "";
        this.email = "";
        this.phoneNumber = "";
        this.age = 0;
        this.salary = 0.0;
    }

    //constructor with all fields
    public Employee(String firstName, String lastName, String patronymic, String position, String email, String phoneNumber, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    //constructor for accountant
    public Employee(String firstName, String lastName, String patronymic, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
