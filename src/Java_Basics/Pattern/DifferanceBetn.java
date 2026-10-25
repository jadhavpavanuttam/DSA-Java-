package Java_Basics.Pattern;

public class DifferanceBetn {
    public static void main(String[] args) {
        System.out.println("From 1 to 10 : " + differanceSum(1, 10));
    }

    //sum formula =>(n*n+1)/2
    private static int differanceSum(int m, int n) {
//        int i1 = 10;
//        int i = 110;
//        System.out.println("ANSWER IS : " + i1 * i);
        // 'n' numbers divisible by 'm' or not ?
        int x = n / m;                      // 10/1 = 10
        int num2 = m * x * (x + 1) / 2;     // 10 * 10 (11) --> 1100
        int num1 = (n * n + 1) - num2;      //101-1100 -->1001  --> 1,2,4,8 -->1,0,0,1 --> 1 & 8 includes
        return Math.abs(num1 - num2);

    }
}
