package strings;

public class ReverseEach {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("pavan jadhav is great"));
    }
    static String reverseEachWord(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder out = new StringBuilder();

        for (int k = 0; k < words.length; k++) {
            for (int j = words[k].length() - 1; j >= 0; j--)
                out.append(words[k].charAt(j));
            if (k < words.length - 1) out.append(' ');
        }
        return out.toString();
    }
}
