package strings;

public class Pangram {
    public static void main(String[] args) {
        System.out.println("pangram ? "+isPangram("abcdefgaa"));
        System.out.println("pangram ? "+isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println("sorted char : "+sortCharacters("jagruti"));
    }
    static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z' && !seen[c - 'a']) {
                seen[c - 'a'] = true;
                count++;
            }
        }
        return count == 26;
    }
    static String sortCharacters(String s) {
        char[] a = s.toCharArray();
        java.util.Arrays.sort(a);
        return new String(a);
    }
}
