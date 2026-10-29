package dynamic_programming;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
/**
 * Back Tracking  Algo :-
 *
 * void backtrack(State state) {
 *
 *     if (isSolution(state)) {
 *         saveSolution(state);
 *         return;
 *     }
 *
 *     for (Choice choice : getChoices(state)) {
 *
 *         if (isValid(choice, state)) {
 *
 *             makeChoice(choice, state);
 *
 *             backtrack(state);
 *
 *             undoChoice(choice, state);
 *         }
 *     }
 * }
 */