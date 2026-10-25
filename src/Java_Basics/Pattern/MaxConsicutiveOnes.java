package Java_Basics.Pattern;

public class MaxConsicutiveOnes {
    public static void main(String[] args) {
        System.out.println("MAXIMUM CONSICUTIVE SEQUENCE IS : " + findConsecutiveOne(new int[]{1, 1, 0, 1, 1, 1}));
    }

    private static int findConsecutiveOne(int[] nums) {
        int left = 0;
        int ans = 0;
        int window = 0;
        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
            // 1 zero || 0 zero
            while (!((right - left + 1) == window || window == right - left))
                window -= nums[left++];
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
// manually -->  ans = ( ans >= ( right - left + 1 ) ) ? ans : (right - left + 1);
//Note : Sliding window technique we have to used in the concept of sub array.
/**
 * sliding window.
 * two pointer.
 * prefix sum.
 */