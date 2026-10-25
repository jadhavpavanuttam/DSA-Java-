package arraySeries;

public class MedianMaxWindKthEle {
    public static void main(String[] args) {

        int[] ints = {1, 231, 5, 4, 35, 4, 45, 6, 67};
        System.out.println("Max Sindow sum : " + ints);
        System.out.println("median : " + median(ints, new int[]{23, 45, 2, 6, 46, 7}));
        System.out.println("kth largest ele : " + kthLargest(ints, 3));
        System.out.println();
    }

    static long maxWindowSum(int[] a, int k) {
        if (k <= 0 || k > a.length) throw new IllegalArgumentException();

        long sum = 0;
        for (int i = 0; i < k; i++) sum += a[i];

        long best = sum;
        for (int i = k; i < a.length; i++) {
            sum += (long) a[i] - a[i - k];
            best = Math.max(best, sum);
        }
        return best;
    }

    static double median(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            c[k++] = a[i] <= b[j] ? a[i++] : b[j++];

        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];

        if (c.length == 0) throw new IllegalArgumentException();

        int m = c.length / 2;
        if (c.length % 2 == 1) return c[m];
        return ((long) c[m - 1] + c[m]) / 2.0;
    }

    static int kthLargest(int[] a, int k) {
        if (k < 1 || k > a.length) throw new IllegalArgumentException();

        int[] b = a.clone();
        java.util.Arrays.sort(b);
        return b[b.length - k];
    }
}
