package arraySeries;

public class EqulbSum {
    public static void main(String[] args) {
        System.out.println(equilibriumIndex(new int[]{1, 2, 4, 1,5, 7, 4, 2, 1}));
    }

    static int equilibriumIndex(int[] a) {
        long total = 0, left = 0;
        for (int x : a) total += x;

        for (int i = 0; i < a.length; i++) {
            total -= a[i];
            if (left == total) return i;
            left += a[i];
        }
        return -1;
    }
}
