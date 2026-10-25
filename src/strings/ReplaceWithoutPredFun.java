package strings;

public class ReplaceWithoutPredFun {
    public static void main(String[] args) {
        System.out.println("pavan " + " a replace by @" + replaceChar("rock", 'c', 'k'));
    }

    static String replaceChar(String s, char oldChar, char newChar) {
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++)
            if (a[i] == oldChar)
                a[i] = newChar;

        return new String(a);
    }
}
