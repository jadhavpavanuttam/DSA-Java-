package strings;

public class PallindromStr {
    public static void main(String[] args) {
        System.out.printf("naman is pallindrom ? " + isPalindrome("naman"));
        System.out.printf("naman is pallindrom ? " + longestPalindrome("naman is the boss"));
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    static String longestPalindrome(String s) {
        if (s.isEmpty()) return "";
        int start = 0, max = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k < 2; k++) {
                int l = i, r = i + k;
                while (l >= 0 && r < s.length()
                        && s.charAt(l) == s.charAt(r)) {
                    if (r - l + 1 > max) {
                        start = l;
                        max = r - l + 1;
                    }
                    l--;
                    r++;
                }
            }
        }
        return s.substring(start, start + max);
    }
}
