package Java_Basics.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Find1To100PrimeNumber {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        boolean isprime;
        int i;
        int num;
        for (num = 2; num <= 101; num++) {
            isprime = true;
            for (i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                list.add(num);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Elements in list are:" + list);
//        System.out.println(list.size()/2);
        System.out.println("The size of list is:" + list.size());
        for (int x : list) {
            if (/*x==list.size()/2*/ list.size() / 2 == x) {
                break;
            }
            list1.add(x);
        }
        System.out.println(list1);

    }
}

