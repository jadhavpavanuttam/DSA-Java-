package strings;

public class DuplicateRemoveFreqCnt {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("pavan"));
        characterFrequency("ananas");
        char ananas = maxFrequencyChar("ananas");
        System.out.println("MAXIMUM REPEATED CHAR : "+maxFrequencyChar("ananas"));
    }

    static String removeDuplicates(String s) {
        boolean[] seen = new boolean[65536];
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                out.append(c);
            }
        }
        return out.toString();
    }

    static void characterFrequency(String s) {
        java.util.Map<Character, Integer> map =
                new java.util.LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
    static char maxFrequencyChar(String s) {
        int[] freq = new int[65536];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        char best = '\0';
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] > max) {
                max = freq[c];
                best = c;
            }
        }
        return best;
    }
}
