package Java_Basics.Pattern;

import java.util.Scanner;

public class RectAngulerPattern {
    public static void main(String[] args) {
        /*for(int i=0; i<5;i++)  //row's
        {
           for (int j=0;j<5;j++) //column's
           {
               if(i==0||i==4||j==0||j==4)
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
            System.out.println();
        }
        for(int i=0; i<5;i++)  //row's
        {
            for (int j=0;j<5;j++) //column's
            {
                if(i<j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<5;i++)  //row's
        {
            for (int j=0;j<5;j++) //column's
            {
                if(i>j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

         */
        int r=new Scanner(System.in).nextInt();
    for (int i=1;i<=r;i++)
    {
        //print r-i
        for(int j=1;j<r-i;j++) {
            System.out.print(" ");
        }
        //2 * i-1
         for (int k=1;k<=2*i-1;k++)
         {
             System.out.print("*");
        }
        System.out.println();
    }
    }
}

//Rectangular pattern with spaces
/*
 *****
 *   *
 *   *
 *   *
 *****
 */

//Rectangular pattern
/*
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 */