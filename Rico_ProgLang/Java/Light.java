package Java;

public class Light implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("The light is now ON. Brightness set to 80%.");
    }

    @Override
    public void turnOff() {
        System.out.println("The light is now OFF.");
    }
}