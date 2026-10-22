package Java_Basics.PatternPrinting;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter Any Numbre:");
        int sum=0;
        int n=new Scanner(System.in).nextInt();
        int original=n;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digit is:"+sum);
    }
}
/*
Enter Any Numbre:
123
Sum of digit is:6
 */