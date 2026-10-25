package arraySeries;

import java.util.*;

public class NextGreater {

    public static void main(String[] args) {
        System.out.println("Next Greater Element Is : " + Arrays.toString(nextGreater(new int[]{534, 34, 52, 56, 456, 6, 45647})));
    }

    public static int[] nextGreater(int[] nums) {

        int[] result = new int[nums.length];

        Arrays.fill(result, -1);  //fill -1 at position.

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop();
                result[index] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }
}