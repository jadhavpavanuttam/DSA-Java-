package strings;

public class FirstUniqueEle {
    public static void main(String[] args) {
        System.out.println(firstUnique("abdsacaewebd"));
    }
    static char firstUnique(String s) {
        int[] freq = new int[65536];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1) return s.charAt(i);

        return '\0'; // no unique character
    }
}
