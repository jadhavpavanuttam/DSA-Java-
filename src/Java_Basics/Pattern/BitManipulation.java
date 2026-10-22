package Java_Basics.PatternPrinting;

import java.util.Scanner;

public class BitManipulation {

    public static void main(String[] args) {
        System.out.println("Enter Any Number :");
        int n=new Scanner(System.in).nextInt();

        System.out.println("binary Transformation of  "+ n+"  is  :  "+decimalToBinery(n));
        System.out.println("Enter Any Binary String :");
        String bin=new Scanner(System.in).next();
        System.out.println("Decimal TransFormer : "+binarToDecimal(bin));
    }
    private static String decimalToBinery(int n)
    {
        if (n==0)
        {
            return "0";
        }
        String res="";
        while(n>0)
        {
             int rem=n%2;
             n/=2;
             res+=rem;
        }
        return new StringBuilder(res).reverse().toString();
    }
    private static int binarToDecimal(String bin)
    {
        int length=bin.length()-1;
        int res=0,m=1;
        for(int i=length;i>=0;i--)
        {
            char lastCharecter=bin.charAt(i);
            Integer lastBit=Integer.valueOf(String.valueOf(lastCharecter));
            res+=m*lastBit;
            m*=2;
        }
        return res;
    }
}
/*
Enter Any Number :
23
binary Transformation of 23 is 10111

Enter Any Binary String :
1001
Decimal TransFormer :9
 */

