package strings;

public class ExpandAndFindLongestChar {
    public static void main(String[] args) {
        System.out.println("Expand " + expand("p1a2v1a1n1"));
        System.out.println("Long Run  :" + longestRun("abcdeefffggg"));
    }

    static String expand(String s) {
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i++);
            if (!Character.isLetter(c))
                throw new IllegalArgumentException("Expected letter");

            int count = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                count = count * 10 + s.charAt(i++) - '0';
                if (count > 100000) throw new IllegalArgumentException("Too large");
            }

            for (int j = 0; j < count; j++) r.append(c);
        }
        return r.toString();
    }

    static int longestRun(String s) {
        int best = 0, run = 0;
        char prev = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            run = i > 0 && c == prev ? run + 1 : 1;
            best = Math.max(best, run);
            prev = c;
        }
        return best;
    }
}
