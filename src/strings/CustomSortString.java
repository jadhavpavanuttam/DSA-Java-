package strings;

import java.util.*;

public class CustomSortString {
    public static void main(String[] args) {
        System.out.println("CUSTOM SORTING IS : " + customSort("cba", "abcd"));
        ;
    }

    private static String customSort(String order, String s) {
        //order -->cba
        //s -->abcd
        //o/p -->cbda
        int i = 0;
        Set<Character> set = new HashSet<>();
        int[] ca = new int[26];
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
            } else {
                ca[c - 'a']++;
            }
        }
        for (char c : order.toCharArray()) {
            int i1 = ca[c - 'a'];
            while (i1-- > 0) {
                sb.append(c);
            }
        }
        sb.append(order);
        return sb.toString();
    }
}
