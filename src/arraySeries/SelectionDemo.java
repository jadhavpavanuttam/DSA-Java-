package arraySeries;

import java.util.Arrays;

public class SelectionDemo {
    public static void main(String[] args) {
        System.out.println("SORTED ELEMENTS ARE : " + Arrays.toString(selectionSort(new int[]{6, 33, 4, 4, 6, 5, 5, 343, 6, 56})));
        int[] ints = selectionSort(new int[]{1, 5, 5, 34, 5, 43, 6, 57, 6, 57});
        int i = removeSortedDuplicates(ints);
        System.out.println("AFTER REMOVING SORTED DUPLICATES : " + i);
    }

    static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) min = j;

            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
        return a;
    }

    static int removeSortedDuplicates(int[] a) {
        if (a.length == 0) return 0;
        int k = 1;

        for (int i = 1; i < a.length; i++)
            if (a[i] != a[k - 1]) a[k++] = a[i];

        return k;
    }
}
