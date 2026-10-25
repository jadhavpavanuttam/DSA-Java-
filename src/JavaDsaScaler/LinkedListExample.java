package JavaDsaScaler;

import java.lang.reflect.Array;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 4, 4, 9, 80, 5, 6);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.poll(); //remove it first element
        System.out.println(list);
        list.addAll(list1);
        list.pollLast();//removed it last element
        System.out.println(list.peek()); //it will return last elements
        System.out.println(list);
        System.out.println(list.pop()); //remove last element
        list.toString();
        System.out.println(list.getClass().getName());

    }
}
