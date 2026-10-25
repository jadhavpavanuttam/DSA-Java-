package Java_Basics.Pattern;

import java.util.Scanner;

public class FactorialOfGivenRange {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        int r = new Scanner(System.in).nextInt();
        int fact = 1;
        for (int i = 1; i <= r; i++)
            System.out.println(fact *= i);
//        System.out.println("Factorial of "+r+" is :"+fact);

    }
}
/*
Enter a number :
7

1
2
6
24
120
720
5040


 */