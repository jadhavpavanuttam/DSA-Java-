package Java_Basics.Pattern;

import java.util.*;

public class TwoSumUsingHashMap {
    public static void main(String[] args) {
        //THIS TRICK WILL GIVES BETTER SOLUTION.
        TwoSum sum = new TwoSum();
        sum.add(1);
        sum.add(4);
        sum.add(3);
        sum.add(2);
        sum.add(5);
        sum.add(4);
        sum.add(9);
        sum.add(10);
        sum.add(8);
        sum.add(7);

        System.out.println();

        if (sum.find(2)) {
            System.out.println("Yes ...!! OFF COURSE...");
        } else {
            System.out.println("No ...!! Sorry...");
        }
    }

    private static class TwoSum {
        private HashMap<Integer, Integer> elements = new HashMap<Integer,
                Integer>();

        public void add(int number) {
            if (elements.containsKey(number)) {
                elements.put(number, elements.get(number) + 1);
            } else {
                elements.put(number, 1);
            }
        }

        public boolean find(int value) {
            for (Integer i : elements.keySet()) {
                int target = value - i;
                if (elements.containsKey(target)) {
                    if (i == target && elements.get(target) < 2) {
                        continue;
                    }
                    return true;
                }
            }
            return false;
        }
    }
}