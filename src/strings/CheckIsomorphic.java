package strings;

public class CheckIsomorphic {
    public static void main(String[] args) {
        System.out.println("isomorphic ? " + isomorphic("egg", "add"));
        System.out.println("DELETE FOR ANAGRAM " + deletionsForAnagram("egg", "addition"));
    }

    static boolean isomorphic(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] ab = new int[65536], ba = new int[65536];

        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i), y = b.charAt(i);
            if (ab[x] != ba[y]) return false;
            ab[x] = ba[y] = i + 1;
        }
        return true;
    }

    static int deletionsForAnagram(String a, String b) {
        int[] f = new int[65536];
        for (int i = 0; i < a.length(); i++) f[a.charAt(i)]++;
        for (int i = 0; i < b.length(); i++) f[b.charAt(i)]--;

        int total = 0;
        for (int n : f) total += Math.abs(n);
        return total;
    }
}
