package Java_Basics.Pattern;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Enter Any Number's : ");
        int n=new Scanner(System.in).nextInt();
        int orig=n;
        int numberOfDigit=0;
        while(n>0)
        {
            n=n/10;
            numberOfDigit++;
        }
        System.out.println("Number of digits in :  "+orig+" is "+numberOfDigit);

    }
}

//1234
//Numberof digits in: 1234 is 4