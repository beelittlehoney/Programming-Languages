package Java;

public class Fan implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("The fan is now ON. Speed set to medium.");
    }

    @Override
    public void turnOff() {
        System.out.println("The fan is now OFF.");
    }
}