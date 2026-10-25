package Java_Basics.Pattern;

import java.util.HashSet;
import java.util.Set;

public class CustomSortString {
    public static void main(String[] args) {
        System.out.printf("CUST ORDERING IS : ", customOrder("cba", "abcdsdsabc"));
    }

    private static String customOrder(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int[] ca = new int[26];//always 26 characters in the world
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
            } else {
                ca[c - 'a']++;  // 27-27 = 0++
            }
        }
        for (char c : order.toCharArray()) {
            int i = ca[c - 'a'];
            while (i-- > 0) {
                sb.append(i);
            }
        }
        //"cab", s="aabcd"
        //sb-->d()
        return sb.toString();
    }
}
