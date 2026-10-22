package Java_Basics.Pattern;

public class MaxConsiticutive {
    public static void main(String[] args) {
        System.out.println("MAXIMUM CONSICUTIVE SEQUENCE IS : " + findConsecutiveOne(new int[]{1, 1, 0, 1, 1, 1}));
    }

    private static int findConsecutiveOne(int[] nums) {
        int left = 0;
        int ans = -1;
        int window = 0;
        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
            while ((right - left + 1) != window)
                window -= nums[left++];
            ans = Math.max(ans, window);
        }
        return ans;
    }
}
/**
 * Time complexity : O(n)
 * <p>
 * sliding window()
 * {
 * int left=0;
 * int right=-1;
 * int sum=0;
 * for(i=1 to n)
 * {
 * add() to right
 * while(condition)
 * {
 * <p>
 * }
 * <p>
 * }
 * }
 */