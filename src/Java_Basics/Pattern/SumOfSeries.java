package Java_Basics.Pattern;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER : ");
        int x = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (x % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("Answer is :" + sum);
    }
}
