package strings;

import java.util.*;
import java.time.*;

public class LongestSubstring {
    private static long l;

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        l = System.currentTimeMillis();
        System.out.println("Stated : " + now);
        int x1 = 0;
        for (Character c : List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')) {
            System.out.println((++x1) + " -->  character : " + c + " ascii : " + (int) c);
        }
        x1 = 0;
        for (Character c : List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')) {
            System.out.println((++x1) + " -->  character : " + c + " ascii : " + (int) c);
        }


        LongestSubstring pavan = new LongestSubstring("pavan");
        if (pavan != null) {
            System.out.println("LENGTH OF LONGEST SUBSTRING : " + pavan.lengthOfLongestSubstring("pavan"));
        }
    }

    LongestSubstring(String s1) {
        System.out.println("Given SubString Is : " + lengthOfLongestSubstring(s1));
        System.out.println("Ended At : " + LocalTime.now() + " ,  In Millis " + (System.currentTimeMillis() - l));
    }


    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}