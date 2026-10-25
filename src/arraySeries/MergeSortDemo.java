package arraySeries;

import java.util.*;

public class MergeSortDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSorted(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 10})));
    }

    static int[] mergeSorted(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            c[k++] = a[i] <= b[j] ? a[i++] : b[j++];

        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];

        return c;
    }
}
