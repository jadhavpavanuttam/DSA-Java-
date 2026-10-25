package Java_Basics.Pattern;

import java.util.Scanner;

public class BitManipulation {

    public static void main(String[] args) {
        System.out.println("Enter Any Number :");
        int n = new Scanner(System.in).nextInt();

        System.out.println("binary Transformation of  " + n + "  is  :  " + decimalToBinary(n));
        System.out.println("Enter Any Binary String :");
        String bin = new Scanner(System.in).next();
        System.out.println("Decimal TransFormer : " + binaryToDecimal(bin));
    }
    private static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String res = "";
        while (n > 0) {
            int rem = n % 2;     //remainder  -->0,1
            n /= 2;              //quotient   --> one-half
            res += rem;          //"0/1" add the remainder to the result.
        }
        System.out.println("RESULT IS : " + res);
        return new StringBuilder(res).reverse().toString();
    }

    private static int binaryToDecimal(String bin) {
        //bin 101
        int length = bin.length() - 1;
        int res = 0, m = 1;
        for (int i = length; i >= 0; i--) {
            char lastCharacter = bin.charAt(i);
            int lastBit = Integer.parseInt(String.valueOf(lastCharacter));
            res += m * lastBit;
            m *= 2;
        }
        return res;
    }
}
/*
//    Note this one :-
//  left shift --> multiply by 2
//  right shift -->divide by 2
5<<2 -->10
5>>2 -->2

Enter Any Number :
123
binary Transformation of  123  is  :  1111011
Enter Any Binary String :
1111011
Decimal TransFormer : 123
 */

