package JavaDsaScaler;

import javax.imageio.stream.ImageInputStreamImpl;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pavan");
        map.put(2, "Amol");
        map.put(3, "Rohit");
        map.put(4, "Bhumika");
        map.put(5, "vaibhav");
        map.put(7, "Jagruti");
        System.out.println(map);
        System.out.println(map.containsKey(7));
//        boolean jagruti = map.containsValue("Jagruti");
//        System.out.println(jagruti);
        for (int i = 0; i < map.size(); i++) {
            System.out.println();
        }
//        for (Map.Entry<Integer,String> )
    }
}
