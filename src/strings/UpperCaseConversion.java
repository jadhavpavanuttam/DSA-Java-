package strings;

public class UpperCaseConversion {
    public static void main(String[] args) {
        System.out.printf("pavan upper case is  : "+ toUpperManual("pavan"));
    }

    static String toUpperManual(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z')
                c = (char) (c - 'a' + 'A');

            result.append(c);
        }
        return result.toString();
    }
}
