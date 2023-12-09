package HWInterfaces.Task2;

public class Television2 implements ElectronicDevice2 {
    @Override
    public void turnOn() {
        System.out.println("Television2 On");
    }

    @Override
    public void turnOff() {
        System.out.println("Television2 Off");
    }
}
