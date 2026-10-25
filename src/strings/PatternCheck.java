package strings;

public class PatternCheck {
    public static void main(String[] args) {
        System.out.println(findPattern("end","start"));
        System.out.println("is unique ? "+uniqueWords("jagruti"));
    }
    static int findPattern(String s, String p) {
        if (p.isEmpty()) return 0;

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int j = 0;
            while (j < p.length() && s.charAt(i + j) == p.charAt(j))
                j++;
            if (j == p.length()) return i;
        }
        return -1;
    }
    static boolean uniqueWords(String s) {
        String[] words = s.trim().isEmpty() ? new String[0] : s.trim().split("\\s+");
        java.util.HashSet<String> seen = new java.util.HashSet<>();

        for (String word : words)
            if (!seen.add(word)) return false;

        return true;
    }
}
