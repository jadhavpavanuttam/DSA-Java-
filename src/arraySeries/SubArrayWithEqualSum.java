package arraySeries;

public class SubArrayWithEqualSum {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,3,1};
        System.out.println("Answer is :"+subArraySum(arr));
    }
    private static int sumArr(int arr[])
    {
        int totalSum=0;
        for (int i=0;i< arr.length;i++)
            totalSum+=arr[i];
        return totalSum;
    }
    private static boolean subArraySum(int []arr)
    {
        int TotalSum=sumArr(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefSum+=arr[i];
            int suFfixSum=TotalSum-prefSum;
            if(prefSum==suFfixSum)
                return true;
        }
        return false;
    }
}

/*
Out put :
2 3 5 6 3 1
Answer is :true
1 3 5 6 3 1
Answer is :false
 */