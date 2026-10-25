package strings;

public class EqualsDemoToggles {
    public static void main(String[] args) {
        System.out.println(sameString("amol", "amoL"));
        System.out.println(toggleCase("amol"));

    }

    static boolean sameString(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;

        return true;
    }
    static String toggleCase(String s) {
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'a' && a[i] <= 'z')
                a[i] = (char)(a[i] - 'a' + 'A');
            else if (a[i] >= 'A' && a[i] <= 'Z')
                a[i] = (char)(a[i] - 'A' + 'a');
        }

        return new String(a);
    }
}
