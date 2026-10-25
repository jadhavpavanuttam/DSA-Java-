package strings;

public class FirstAndLastChar {
    public static void main(String[] args) {
        firstLast("Java is easy");
    }

    static void firstLast(String s) {
        if (s.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        System.out.println("First: " + s.charAt(0));
        System.out.println("Last: " + s.charAt(s.length() - 1));
    }
}
