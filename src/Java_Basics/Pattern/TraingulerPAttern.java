package Java_Basics.Pattern;

import java.util.Scanner;

public class TraingulerPAttern {
    public static void main(String[] args) {
     int r=new Scanner(System.in).nextInt();
        int i;
        for(i=1;i<r-i;i++)
     {
         System.out.println(" ");
     }
        for(int k=1;k<=5;k++)
        {
            System.out.println(k);
        }
        for(int l=i-1;l>=1;l--)
        {
            System.out.println("*");
        }
    }
}
