package Java_Basics.PatternPrinting;

//divisible and non - divisible
public class Solution {

    public static void main(String[] args) {
        System.out.println("sum And Differance is :"+differanceOfSum(7,9));
    }
    private static int differanceOfSum(int n,int m)
    {
        int div=n/m;
        int num2=m*div*(div+1)/2;
        int num1=n*(n+1)/2-num2;
         return num1-num2;

    }
}

/*
5   7
sum And Differance is :15
7   9
sum And Differance is :28
 */