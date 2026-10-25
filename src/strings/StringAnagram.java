package strings;

public class StringAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("jagruti", "graitju"));
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] freq = new int[65536];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }
        for (int n : freq)
            if (n != 0)
                return false;

        return true;
    }
}
