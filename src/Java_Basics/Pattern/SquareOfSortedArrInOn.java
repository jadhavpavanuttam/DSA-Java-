package Java_Basics.Pattern;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class SquareOfSortedArrInOn {
    public static void main(String[] args) {
        int[] ints = squareOfSortedArr(new int[]{-1, 2, 3 - 4, 6, -5, 6, -7});
        Arrays
                .stream(ints)
                .forEach(System.out::println);
    }

    private static int[] squareOfSortedArr(int[] arr) {
        int l = 0, r = arr.length - 1;
        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Math.abs(arr[l]) > Math.abs(arr[r])) {
                res[i] = arr[l] * arr[l];
                l++;
            } else {
                res[i] = arr[r] * arr[r];
                r--;
            }
        }
        return res;
    }
}
//modulus -->Math.abs(i)