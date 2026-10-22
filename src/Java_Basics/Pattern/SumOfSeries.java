package Java_Basics.PatternPrinting;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
    int sum=0;
        for(int i=1;i<=x;i++)
    {
        if(x%2==0)
        {
            sum-=i;
        }
        else
        {
            sum+=i;
        }
    }
        System.out.println("Answer is :"+sum);
}
}
