package arraySeries;

import java.util.*;

public class FrequencyExample {

    public static void main(String[] args) {

        int[] orders = {101, 205, 301, 101, 205, 101};

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int order : orders) {
            frequency.put(
                    order,
                    frequency.getOrDefault(order, 0) + 1
            );
        }

        System.out.println(frequency);
    }
}