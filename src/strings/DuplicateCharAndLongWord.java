package strings;

public class DuplicateChr {
    public static void main(String[] args) {
        duplicateChars("ramuuu");
    }
    static void duplicateChars(String s) {
        int[] freq = new int[65536];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] > 1) {
                System.out.println(c + " : " + freq[c]);
                freq[c] = 0; // print each character once
            }
        }
    }
}
