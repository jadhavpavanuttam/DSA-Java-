package arraySeries;

import java.util.Arrays;
import java.util.HashSet;

public class Colln {
    public static void main(String[] args) {
        System.out.println("Asd");
        HashSet<Object> objects = new HashSet<>();
        for (Integer i : Arrays.asList(1, 4, 2, 3, 5, 6, 1, 2, 3, 4)) {
            objects.add(i);
//            System.out.println(i);

        }
        System.out.println(objects.getClass().getName() + " : " + objects);

    }
}
