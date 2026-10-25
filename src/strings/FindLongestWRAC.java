package strings;

public class FindLongestWRAC {
    public static void main(String[] args) {
        System.out.println(longestUniqueSubstring("abcdefghhliisscerr"));
        System.out.println(countSubstring("abc def ghh lii ssc err","ssc"));
    }

    static int longestUniqueSubstring(String s) {
        int[] last = new int[65536];
        java.util.Arrays.fill(last, -1);

        int start = 0, best = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) start = last[c] + 1;
            last[c] = i;
            best = Math.max(best, i - start + 1);
        }
        return best;
    }

    static int countSubstring(String s, String p) {
        if (p.isEmpty()) return 0;
        int count = 0;

        for (int i = 0; i <= s.length() - p.length(); ) {
            if (s.startsWith(p, i)) {
                count++;
                i += p.length();
            } else i++;
        }
        return count;
    }
}
// h --> 8
//ssc -->1