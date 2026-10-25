package strings;

public class CompressConsucutive {
    public static void main(String[] args) {
        System.out.println(compress("a4b2c1"));
    }

    static String compress(String s) {
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            int j = i;
            while (j < s.length() && s.charAt(j) == c) j++;
            r.append(c).append(j - i);
            i = j;
        }
        return r.toString();
    }
}
