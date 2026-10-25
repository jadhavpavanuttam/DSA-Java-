package arraySeries;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
//        System.out.println("Enter Arrays ");
    int [][]arr={{1,2,3},{4,5,6},{8,6,7}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr,(int []o1,int []o2)->getSum(o2)-getSum(o1));  //sort on the basis of given method
        System.out.println("After Reverse Sorting");
        System.out.println(Arrays.deepToString(arr));}
    private static int getSum(int []a)
    {
        int sum=0;
        for (int x:a)
            sum+=x;
        return sum;
    }

}
