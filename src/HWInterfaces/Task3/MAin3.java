package HWInterfaces.Task3;

import java.util.ArrayList;
import java.util.List;

public class MAin3 {
    public static void main(String[] args) {
        Soup3 soup3 = new Soup3();
        Steak3 steak3 = new Steak3();
        List<Dish3> dish3s = new ArrayList<>();

        dish3s.add(soup3);
        dish3s.add(steak3);

        for (Dish3 dish3 : dish3s
             ) {
            MakeDifferentDishes(dish3);
        }
    }

    public static void MakeDifferentDishes(Dish3 dish3){
        if (dish3 instanceof Soup3 soup3){
            soup3.cook();
        } else if (dish3 instanceof Steak3 steak3) {
            steak3.cook();
        }
    }

}
