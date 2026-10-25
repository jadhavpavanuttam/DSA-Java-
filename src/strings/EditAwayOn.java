package strings;

public class EditAwayOn {
    public static void main(String[] args) {
        System.out.println(oneEditAway("bat", "but"));
        System.out.println(oneEditAway("bta", "but"));
    }

    static boolean oneEditAway(String a, String b) {
        if (Math.abs(a.length() - b.length()) > 1)
            return false;

        int i = 0, j = 0, edits = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                edits++;
                if (edits > 1) return false;

                if (a.length() > b.length()) i++;
                else if (b.length() > a.length()) j++;
                else {
                    i++;
                    j++;
                }
            }
        }

        if (i < a.length() || j < b.length()) edits++;
        return edits == 1;
    }
}
