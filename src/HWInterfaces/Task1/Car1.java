package HWInterfaces.Task1;

public class Car1 implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Car' Engine is working");
    }

    @Override
    public void stop() {
        System.out.println("Car' Engine is stopped");
    }
}
