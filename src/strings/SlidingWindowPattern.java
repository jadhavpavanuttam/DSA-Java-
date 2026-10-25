package strings;

public class SlidingWindowPattern {
    public static void main(String[] args) {
        anagramIndices("Java Backend Developer", "Backend Developer");
    }

    static void anagramIndices(String s, String p) {
        if (p.isEmpty() || p.length() > s.length()) return;

        int[] f = new int[65536];
        for (int i = 0; i < p.length(); i++) f[p.charAt(i)]++;

        int missing = p.length();
        for (int i = 0; i < s.length(); i++) {
            if (f[s.charAt(i)]-- > 0) missing--;

            if (i >= p.length() && f[s.charAt(i - p.length())]++ >= 0)
                missing++;

            if (i >= p.length() - 1 && missing == 0)
                System.out.println(i - p.length() + 1);
        }
    }
}
/*
answer will 5
:: length of first is 5 more than second
Uses a sliding window. Assumes an empty pattern is not considered a valid search.
 */
