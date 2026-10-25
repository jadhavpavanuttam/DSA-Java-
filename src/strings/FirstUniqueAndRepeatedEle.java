package strings;

public class FirstUniqueAndRepeatedEle {
    public static void main(String[] args) {
        System.out.println(firstUnique("UNIQUE : " + "abdsacaewebd"));
        System.out.println(firstRepeating("REPEATED : " + "abdsacaewebd"));
    }

    static char firstUnique(String s) {
        int[] freq = new int[65536];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1) return s.charAt(i);

        return '\0'; // no unique character
    }

    static char firstRepeating(String s) {
        boolean[] seen = new boolean[65536];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen[c]) return c;
            seen[c] = true;
        }
        return '\0';
    }
}
