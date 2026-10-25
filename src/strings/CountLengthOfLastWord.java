package strings;

public class CountLengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("pavan jadhav "));
    }

    private static int lengthOfLastWord(String s) {
        //s--> Hello World
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                res++;
            else if (res > 0)
                return res;
        }
        return res;
    }
}
