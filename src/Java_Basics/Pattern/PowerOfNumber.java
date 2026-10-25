package Java_Basics.Pattern;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a coefficient :");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Enter a Power:");
        int p = new Scanner(System.in).nextInt();
        int a = 1;
        int i = 0;
        while (i != p) {
            a = a * c;//a = 1*2,2*2,4*2,8*2...p times
            i++;
        }
        System.out.println("Answer is :" + a);
    }
}
/*
Enter a coefficient :
3
Enter a Power:
3
Answer is :27
 */