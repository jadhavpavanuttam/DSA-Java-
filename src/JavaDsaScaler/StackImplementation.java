package JavaDsaScaler;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.push(4);
        stack.push(23);
        stack.push(24);
        stack.push(21);
        System.out.println(stack);
        stack.pop();//remove last elements
        stack.remove(stack);
        stack.addElement(23);
        System.out.println(stack);
    }

    ;

}
