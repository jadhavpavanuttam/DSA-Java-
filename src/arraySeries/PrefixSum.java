package arraySeries;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("ENTER A POSITION : ");
        int x = new Scanner(System.in).nextInt();
        int sum = 0;
        if (x < 0 || x > arr.length - 1) {
            System.out.println("INVALID INPUT :");
            return;

        }
        for (int i = 0; i < arr.length; i++) {

            if (i == x) {
                break;
            }
            sum += arr[i];
        }
        System.out.println("PREFIX SUM IS :" + sum);
    }
}
/**
 * Day:     1   2   3   4   5
 * Sales:  10  20  30  40  50
 */