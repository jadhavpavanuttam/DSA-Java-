package JavaDsaScaler;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
//    Car c=new Car();
        Set<Car> set = new HashSet<>();
        set.add(new Car(1, "Brezza", "lowest"));
        set.add(new Car(2, "Enova", "Smoothly"));
        set.add(new Car(3, "BMW", "shallowest"));
        set.add(new Car(5, "G-i10", "glob"));
        set.add(new Car(4, "Swift", "Cleaner"));
        set.add(new Car(4, "Swift", "Cleaner"));

//        set.add(c.Car(4,"Brezza","forward"));
//         set.add(c.Car(5,"Swift","Raison"));
//         set.add(c.Car(1,"Grand i10","7th"));
//         set.add(c.Car(3,"Lamma","Ft4"));
//         set.add(c.Car(5,"Thaar","100mlg"));
        System.out.println("Original Set Is : " + set);
//        System.out.println(set.contains(c.tyre));
        System.out.println(/*set.getClass().getName()+" \n"+*/set);
        System.out.println("Set is Empty : " + set.isEmpty());
        System.out.println(set.contains(3));
        System.out.println("Size of set is : " + set.size());
    }
}
