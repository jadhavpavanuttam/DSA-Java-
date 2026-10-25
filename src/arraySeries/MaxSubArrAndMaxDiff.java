package arraySeries;

public class MaxSubArrAndMaxDiff {
    public static void main(String[] args) {
        System.out.println("Max diff : " + maxDifference(new int[]{1, 2, 6, 5, 6, 77}));
        System.out.println("Max Sub-Arr: " + maxSubarraySum(new int[]{1, 2, 6, 5, 6, 77}));  //kadane's a;go
    }

    static Integer maxDifference(int[] a) {
        if (a.length < 2) return null;
        int min = a[0], best = a[1] - a[0];

        for (int i = 1; i < a.length; i++) {
            best = Math.max(best, a[i] - min);
            min = Math.min(min, a[i]);
        }
        return best;
    }

    static long maxSubarraySum(int[] a) {
        if (a.length == 0) throw new IllegalArgumentException();

        long current = a[0], best = a[0];
        for (int i = 1; i < a.length; i++) {
            current = Math.max(a[i], current + a[i]);
            best = Math.max(best, current);
        }
        return best;
    }
}
