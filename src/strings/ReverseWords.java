package strings;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("pavan is great man"));;
    }

    static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (out.length() > 0) out.append(' ');
            out.append(words[i]);
        }

        return out.toString();
    }
}
