package strings;

public class DigitOnly {
    public static void main(String[] args) {
        System.out.println(digitsOnly("Digits ? " + "1234asca#23aas$43as"));
        System.out.println(digitsOnly("Digits ? " + "12340"));
        System.out.println(isRotation("Rotated Str ? " + "abcd", "cdab"));
    }

    static boolean digitsOnly(String s) {
        if (s.isEmpty()) return false;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                return false;

        return true;
    }

    static boolean isRotation(String a, String b) {
        return a.length() == b.length()
                && (a + a).contains(b);
    }
}
