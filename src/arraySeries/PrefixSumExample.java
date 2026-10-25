package arraySeries;

import java.util.Scanner;

public class PrefixSumExample {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,5,7,6};
        int preFxSm=preafixSum(arr,arr.length);
        System.out.println("Prefix Sum is :"+preFxSm);
    }
    private static int preafixSum(int []pre,int n)
    {
        System.out.println("Enter Position :");
        int position=new Scanner(System.in).nextInt();
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(count==position)
            {
                System.out.println("Sum is :"+sum);
                break;
            }
            sum+=pre[i];
            count++;
        }
        return sum;
    }
}

/*
4
Sum is :10
Prefix Sum is :10
 */