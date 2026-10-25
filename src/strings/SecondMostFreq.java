package strings;

public class SecondMostFreq {
    public static void main(String[] args) {
        System.out.println("Most freq char sec -->  " + secondMostFrequent("hello from java"));
    }

    static char secondMostFrequent(String s) {
        int[] f = new int[65536];
        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        int first = 0, second = 0;
        char answer = '\0';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (f[c] > first) {
                second = first;
                first = f[c];
            } else if (f[c] < first && f[c] > second) {
                second = f[c];
                answer = c;
            }
        }
        // See note below: a two-pass implementation is safer for ties.
        int max1 = 0, max2 = 0;
        for (int n : f) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2 && n < max1) max2 = n;
        }
        for (int i = 0; i < s.length(); i++)
            if (f[s.charAt(i)] == max2 && max2 > 0)
                return s.charAt(i);

        return '\0';
    }
}
