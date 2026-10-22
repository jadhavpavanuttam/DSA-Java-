package Java_Basics.Pattern;

import javax.swing.*;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int n = scanner.nextInt();
        int i, j = 0;
        int sum = 0;
        int[] arr = new int[n];//{12,23,24,3,54,56,5,6654};
        System.out.println("Enter " + n + " Element in the array :");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        while (j != arr.length-1) {
            sum += arr[j];
            j++;
        }
        System.out.println("Sum of the number's is :" + sum);
//        int i1 = Integer.parseInt(rotate(arr, n));
        System.out.println("Array is rotated : " + rotate(arr, Spring.UNSET));
    }

    static int[] rotate(int[] arr, int size) throws NumberFormatException {
        for (int i = size - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
//       return arr;
        return arr;
    }
}
