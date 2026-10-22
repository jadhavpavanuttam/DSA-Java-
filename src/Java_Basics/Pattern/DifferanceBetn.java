package Java_Basics.Pattern;

public class IsDivisibleOrNot {
    public static void main(String[] args) {
        System.out.println("From 1 to 10 : " + differanceSum(1, 10));
    }

    //sum formula =>(n*n+1)/2
    private static int differanceSum(int m, int n) {
        int x = n / m;
        int num2 = m * x * (x + 1) / 2;
        int num1 = (n * n + 1) - num2;
        return Math.abs(num1 - num2);
    }
}
