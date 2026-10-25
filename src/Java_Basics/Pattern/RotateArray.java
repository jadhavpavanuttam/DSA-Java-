package Java_Basics.Pattern;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 42, 1, 5, 7, 4, 23};
        for(int x:arr)
            System.out.print(x+" ");
        System.out.println();
        int n = arr.length;
        System.out.println("Enter position to rotate :");
        int d = new Scanner(System.in).nextInt();
        leftRotateArray(arr, n, d);

        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateArray(int[] arr, int n, int d) {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    private static void reverse(int []arr,int i,int j)
    {
        while(i<j)
        {
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }

    }
}
/*
3 42 1 5 7 4 23
Enter position to rotate :
        4
        [7, 4, 23, 3, 42, 1, 5]

 */
