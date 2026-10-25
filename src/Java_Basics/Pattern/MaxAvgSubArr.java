package Java_Basics.Pattern;

public class MaxAvgSubArr {
    public static void main(String[] args) {
        System.out.println("MAXIMUM SUB ARRAY SUM IS : " + maxAvgSArr(new int[]{1, 2, 3, 4, 5, 6}, 4));
        ;
    }

    private static double maxAvgSArr(int[] nums, int k) {
        int ans = 0;
        int window = 0;
        for (int i = 0; i < k; i++) {
            window += nums[i];
        }
        ans = window / k;
        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
            ans = Math.max(ans, window / k);
        }
        return ans;
    }
}
