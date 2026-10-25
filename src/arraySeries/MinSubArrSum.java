package arraySeries;

public class MinSubArrSum {
    public static void main(String[] args) {
        System.out.println(minSubarrayLength(new int[]{1, 2, 34, 14, 5}, 2));
    }

    static int minSubarrayLength(int[] a, long target) {
        int left = 0, best = Integer.MAX_VALUE;
        long sum = 0;

        for (int right = 0; right < a.length; right++) {
            sum += a[right];

            while (sum >= target) {
                best = Math.min(best, right - left + 1);
                sum -= a[left++];
            }
        }
        return best == Integer.MAX_VALUE ? 0 : best;
    }
}
