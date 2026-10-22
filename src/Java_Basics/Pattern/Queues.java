package Java_Basics.PatternPrinting;

import java.util.*;
import java.util.Collections;
public class Queues {
    public static void main(String[] args) {
        //Constant List :
        List <Integer>list=List.of(1,2,33,3,5,56,67,9,878,7);

        //Variable list :
        List<Integer>list1=new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(89);
        list1.add(12);
        list1.add(31);
        //reverse it
        /*
        t=i
        i=j
        j=t
         */
        System.out.println("Before Reverse : "+list1);
//        reverseList(list1);

        Collections.reverse(list1);
        System.out.println(list);
        System.out.println("After Reverse :"+list1);
        System.out.println("After sorting : ");
        Collections.reverse(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println("After revers : ");
        System.out.println(list1);

        //comparator
        Collections.sort(list1,Collections.reverseOrder()); //used internally comparator

    }
    private static void reverseList(List<Integer> list)
    {
        int i=0;
        int j=list.size()-1;
        while (i<j)
        {
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,Integer.valueOf(list.get(j)));
            list.set(j,temp);
            i++;
            j--;
        }

    }

}
