package arraySeries;

public class FizedSizeWindow {
    public static void main(String[] args) {
     
    }
    static long maxWindowSum(int[] a, int k) {
        if (k <= 0 || k > a.length) throw new IllegalArgumentException();

        long sum = 0;
        for (int i = 0; i < k; i++) sum += a[i];

        long best = sum;
        for (int i = k; i < a.length; i++) {
            sum += (long)a[i] - a[i - k];
            best = Math.max(best, sum);
        }
        return best;
    }
}
