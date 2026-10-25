package strings;

public class EqualsDemo {
    public static void main(String[] args) {
        System.out.println(sameString("amol", "amoL"));
    }

    static boolean sameString(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;

        return true;
    }
}
