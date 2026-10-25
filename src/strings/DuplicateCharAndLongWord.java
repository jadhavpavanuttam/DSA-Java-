package strings;

public class DuplicateCharAndLongWord {
    public static void main(String[] args) {
        duplicateChars("ramuuu");
        System.out.println("Longest word : "+longestWord("java is powerful"));
        System.out.println("word count : "+wordCount("java is onw of the most powerful language"));
    }
    static int wordCount(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return s.split("\\s+").length;
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
    static String longestWord(String s) {
        String best = "";
        for (String word : s.trim().split("\\s+"))
            if (word.length() > best.length())
                best = word;
        return best;
    }
}
