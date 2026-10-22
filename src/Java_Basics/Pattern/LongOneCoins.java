package Java_Basics.Pattern;

public class LongOnseCons {
    public static void main(String[] args) {
        System.out.println("LONGEST SUM IS : " + longestOnes(new int[]{1, 0, 1, 0, 1, 1}));
    }
    private static int longestOnes(int[] nums) {
        int left = 0;
        int ans = 0;
        int window = 0;
        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
//            "add" element nums[right] to window
            //1 zero || 0 zero
            while (window < right - left + 1)  //while condition not met
                window -= nums[left++];    //do some logic left from window


            ans = Math.max(ans, (right - left + 1));//update the answer
        }
        return ans;
    }
}
