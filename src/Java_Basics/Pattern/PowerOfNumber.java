package Java_Basics.PatternPrinting;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args){
        System.out.println("Enter a coefficient :");
        int c=new Scanner(System.in).nextInt();
        System.out.println("Enter a Power:");
        int p=new Scanner(System.in).nextInt();
   int a=1;
   int i=0;
    while (i!=p)
    {
        a*=c;
        i++;
    }
        System.out.println("Answer is :"+a);
    }
}
/*
Enter a coefficient :
3
Enter a Power:
3
Answer is :27
 */