package HWInterfaces.Task1;

import java.util.ArrayList;
import java.util.List;

public class MainFor1 {
    public static void main(String[] args) {

        Car1 car1 = new Car1();
        Motorcycle1 motorcycle1 =new Motorcycle1();
        List<Vehicle1> vehicle1s = new ArrayList<>();

        vehicle1s.add(car1);
        vehicle1s.add(motorcycle1);

        for (Vehicle1 vehicle:
             vehicle1s) {
            StartStopTransport(vehicle);
        }
    }
    public static void StartStopTransport(Vehicle1 vehicle1){
        if (vehicle1 instanceof Car1 car1){
            car1.start();
            car1.stop();
        }
        else if (vehicle1 instanceof Motorcycle1 motorcycle1)
        {
            motorcycle1.start();
            motorcycle1.stop();
        }
    }
}
