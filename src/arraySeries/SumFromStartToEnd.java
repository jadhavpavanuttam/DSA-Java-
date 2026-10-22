import java.util.Scanner;

public class SumFromStartToEnd {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int arr[]=new int[]{1,8,2,3,4,5,6,1};
        System.out.println("Etert Start index :");
        int l=new Scanner(System.in).nextInt();
        System.out.println("Enter End Index :");
        int r=new Scanner(System.in).nextInt();;
        int x=preFixSum(arr,l,r);
        System.out.println("The Sum from  "+ l +"  to  "+r+"  is  :"+x);
    }
    private static int preFixSum(int []arr,int l,int r)
    {
        int sum=0;
        int pref=0;
        int i;
        for(i=1;i<=l;i++)
            pref+=arr[i];
        i=0;   // i=2  r=5
        while(i!=arr.length)
        {
            if(i==r)
            {
                sum-=pref;
                System.out.println("Sum is :"+sum);
                break;
            }
            sum+=arr[i];
            i++;
        }
        return sum;
    }
}

/*
Output is :

Sum is :8
The Sum from  2  to  5  is  :8
 */

/*
sum=pref[i]-pref[i-1];
 */