package Java_Basics.Pattern;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        System.out.println("Unique elements are : " + removeDual(new int[]{1, 2, 3, 5, 1, 22, 4, 6, 5, 5, 6}));
    }

    private static int removeDual(int[] arr) {
        Arrays.sort(arr);
        int unique = 1;  //number of unique element is 1 from starting.
        for (int i = 1; i < arr.length; i++) {
            {

                //we have to used unique for counting the number of elements.
                if (arr[i] != arr[i - 1]) {
                    unique++;
                    arr[unique - 1] = arr[i];
                }
            }
        }
        return unique;
    }
}
/*
algorithm :-
  arr[1, 2, 3, 5, 1, 22, 4, 6, 5, 5, 6]
  sort[arr]
  unique = -->0,1,2,3,4,5..n-1

  for i=1 --> n-1
  {
  if(arr[1]!=arr[0])
  {
  arr[1] , arr[2] , arr[3]...arr[n-1]
  arr[0]=arr[1]
  }

  }
  return unique;
 */