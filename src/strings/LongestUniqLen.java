package strings;

public class LongestUniqLen {
    public static void main(String[] args) {
        System.out.printf("longest uniqe length is : " + longestUniqueLength("pavan jadhav with java backend"));
        System.out.println("is sub sequece or not ? " + isSubsequence("ace", "abcde"));
    }

    static int longestUniqueLength(String s) {
        int[] last = new int[65536];
        for (int i = 0; i < last.length; i++) last[i] = -1;

        int left = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (last[c] >= left) left = last[c] + 1;
            last[c] = right;
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    static boolean isSubsequence(String a, String b) {
        int i = 0;
        for (int j = 0; j < b.length() && i < a.length(); j++)
            if (a.charAt(i) == b.charAt(j)) i++;
        return i == a.length();
    }
}
