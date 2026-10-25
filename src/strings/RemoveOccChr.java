package strings;

public class RemoveOccChr {
    public static void main(String[] args) {
        System.out.println("remove : "+removeCharacter("jayesh",'j'));
    }
    static String removeCharacter(String s, char target) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != target)
                out.append(s.charAt(i));
        return out.toString();
    }
}
