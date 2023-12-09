package HWInterfaces.Task1;

public class Motorcycle1 implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Motocycle' Engine is working");
    }

    @Override
    public void stop() {
        System.out.println("Motocycle' Engine is stopped");
    }
}
