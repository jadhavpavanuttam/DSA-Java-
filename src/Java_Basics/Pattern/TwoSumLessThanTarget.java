package Java_Basics.Pattern;

import java.util.ArrayList;
import java.util.List;

//find two sums whose pairs is less than target
public class TwoSumLessThanTarget {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,-3,-5,-2,4,-6,-7,7};
        sumLessTarget(arr,3);

    }
    private static int sumLessTarget(int []arr,int target)
    {
        int res=0;
        List<Integer> list=new ArrayList<>();
        int i=0;
        while (i<arr.length)
        {
            list.add(arr[i]);
            i++;
        }
        list.sort((a,b)->b-a);
        int l=0,r=list.size()-1;
        while(l!=r)
        {
            if(list.get(l)+list.get(r)<target)
            {
                res+=r-l;
                l++;
            }
                else
                    r--;
        }
       return res;
    }
}
