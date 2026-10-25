package Java_Basics.Pattern;

public class BinaryOperator {
    //    Bitwise operator
    public static void main(String[] args) {
        System.out.println("Bitwise of : 5 & 4 " + "is : " + (5 & 6));
        System.out.println("Bitwise of : 5 | 4 " + "is : " + (5 | 6));
        System.out.println("Bitwise of : 5 ^ 4 " + "is : " + (5 ^ 6));
        System.out.println(5 >> 1);  //2  ->101 : 10=2
        System.out.println(5 << 1);  //10 ->101 : 1010=10
        System.out.println("Most And Least Significant Beat:");
        System.out.println((3456789 & 1) == 1);  // true or false -> 0 | 1
    }

    private boolean isSet(int n) {
        return (n & n - 1) == 0;
    }
}
/*
LEFT SHIFT = A X 2
RIGHT SHIFT = A / 2

Most significant bit & least significant bits:
101 :-
starting '1' is most significant bit.
ending '1' is least significant bit.
set bit --> all one's

Bitwise of : 5 & 4 is : 4
Bitwise of : 5 | 4 is : 7
Bitwise of : 5 ^ 4 is : 3
 */
// >>  right shift means : 1010 ->101
// <<  left shift means :  1010 ->010