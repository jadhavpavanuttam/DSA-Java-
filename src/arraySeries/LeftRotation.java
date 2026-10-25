package arraySeries;

import java.util.Arrays;

//
public class LeftRotation {
    public static void main(String[] args) {
        int[] ints = arraRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 7, 2);
        System.out.println("After Rotating Array Is : " + Arrays.toString(ints));
    }

    private static int[] arraRotate(int[] arr, int n, int d) {
        rotate(arr, 0, d - 1);
        rotate(arr, d, n - 1);
        rotate(arr, 0, n - 1);
        return arr;
    }

    private static void rotate(int[] arr, int x, int y) {
        while (x < y) {
            int z = arr[x];
            arr[x] = arr[y];
            arr[y] = z;
            x++;
            y--;
        }
    }
}
