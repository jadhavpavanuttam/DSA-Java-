package strings;

public class BrctBal {
    public static void main(String[] args) {
        System.out.println(balanced("{{ava}[}"));
        System.out.println(balanced("({{[ava]}}"));
        System.out.println(balanced("({{[]}})"));
    }
    static boolean balanced(String s) {
        java.util.ArrayDeque<Character> stack =
                new java.util.ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();

                if ((c == ')' && open != '(') ||
                        (c == ']' && open != '[') ||
                        (c == '}' && open != '{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
