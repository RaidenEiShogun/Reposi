package HWInterfaces.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Television2 television2 = new Television2();
        Computer2 computer2 = new Computer2();
        List<ElectronicDevice2> electronicDevice2List = new ArrayList<>();

        electronicDevice2List.add(television2);
        electronicDevice2List.add(computer2);

        for (ElectronicDevice2 electronicDevice2 : electronicDevice2List) {
            TurnOnOff(electronicDevice2);
        }

    }

    public static void TurnOnOff(ElectronicDevice2 electronicDevice2){
        if (electronicDevice2 instanceof Computer2 computer2){
            computer2.turnOn();
            computer2.turnOff();
        }
        else if (electronicDevice2 instanceof Television2 television2)
        {
            television2.turnOn();
            television2.turnOff();
        }
    }
}
