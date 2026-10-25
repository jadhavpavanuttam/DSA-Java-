package strings;

public class RemoveOvel {
    public static void main(String[] args) {
        System.out.println(removeVowels("jagruti"));
    }
    static String removeVowels(String s) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if ("aeiou".indexOf(c) < 0)
                out.append(s.charAt(i));
        }

        return out.toString();
    }
}
