package strings;

public class CommanPrefix {
    public static void main(String[] args) {
        System.out.println(commonPrefix(new String[]{ "jagruti", "jay", "johar", "jayesh","jwala"}));
    }

    static String commonPrefix(String[] a) {
        if (a.length == 0) return "";

        String prefix = a[0];

        for (int i = 1; i < a.length; i++) {
            while (!a[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
