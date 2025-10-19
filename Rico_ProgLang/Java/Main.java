package Java;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Light light = new Light();

        System.out.println("Turning appliances ON:");
        fan.turnOn();
        light.turnOn();

        System.out.println("\nTurning appliances OFF:");
        fan.turnOff();
        light.turnOff();
    }
}