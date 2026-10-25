package arraySeries;

import java.util.Arrays;

public class SubArrSum {
    public static void main(String[] args) {
        System.out.println("Sub Array Sum Is : " + Arrays.toString(subarraySum(new int[]{1, 2, 34, 4, 6, 4, 36, 7, 43}, 4)));
    }

    static int[] subarraySum(int[] a, long target) {
        int left = 0;
        long sum = 0;

        for (int right = 0; right < a.length; right++) {
            sum += a[right];

            while (left <= right && sum > target)
                sum -= a[left++];

            if (sum == target && left <= right)
                return new int[]{left, right};
        }
        return new int[]{-1, -1};
    }
}
