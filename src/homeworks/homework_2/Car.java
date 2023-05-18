package homeworks.homework_2;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity is started");
    }

    private void startCommand() {
        System.out.println("Sending Start command...");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system is started");
    }
}
