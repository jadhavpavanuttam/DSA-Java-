package Java_Basics.Pattern;

import java.util.Scanner;

public class ReverseOfNumbers {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("Enter A  Number :");
        int n = new Scanner(System.in).nextInt();
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse Number is :" + rev);
    }
}
/*
Enter A  Number :
1234
Reverse Number is :4321
 */