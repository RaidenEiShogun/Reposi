package HWInterfaces.Task2;

public class Computer2 implements ElectronicDevice2 {
    @Override
    public void turnOn() {
        System.out.println("Comp On");
    }

    @Override
    public void turnOff() {
        System.out.println("Comp Off");
    }
}
