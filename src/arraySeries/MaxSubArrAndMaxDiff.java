package arraySeries;

public class MaxAndMinDiff {
    public static void main(String[] args) {

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
}
