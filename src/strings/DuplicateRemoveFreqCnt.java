package strings;

public class DuplicateRemove {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("pavan"));
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

}
