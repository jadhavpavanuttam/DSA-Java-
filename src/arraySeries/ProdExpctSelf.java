package arraySeries;

import java.util.*;

public class ProdExpctSelf {
    public static void main(String[] args) {
        System.out.println("Answer is : " + Arrays.toString(productExceptSelf(new int[]{1, 2, 34, 1, 53})));
    }

    static long[] productExceptSelf(int[] a) {
        long[] r = new long[a.length];
        long prefix = 1;

        for (int i = 0; i < a.length; i++) {
            r[i] = prefix;
            prefix *= a[i];
        }

        long suffix = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            r[i] *= suffix;
            suffix *= a[i];
        }
        return r;
    }
}
