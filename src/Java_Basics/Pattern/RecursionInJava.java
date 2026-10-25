package Java_Basics.Pattern;

import java.util.Scanner;

public class RecursionInJava {
    public static void main(String[] args) {
        System.out.println("Enter An Number :");
        int n=new Scanner(System.in).nextInt();
        System.out.println("Output is :"+recursive(n));

    }
    private static int recursive(int n)
    {
        if (n==0||n==1)
            return n;
        else
            return n*recursive(n-1);
    }
}
