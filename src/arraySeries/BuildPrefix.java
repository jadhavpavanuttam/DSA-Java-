package arraySeries;

import java.util.Arrays;

public class BuildPrefix {
    public static void main(String[] args) {
        new BuildPrefix();
    }

    private BuildPrefix() {
        int[] ints = buildPrefix(new int[]{1, 2, 3, 41, 54});
        System.out.println("PREFIX SUM IS : " + Arrays.toString(ints));
    }

    public static int[] buildPrefix(int[] nums) {

        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return prefix;
    }

    public static int rangeSum(
            int[] prefix,
            int left,
            int right) {

        return prefix[right + 1] - prefix[left];
    }
}
/**
 * Acurate approach
 */
