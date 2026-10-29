package basicConcepts;

import java.util.Arrays;
import java.util.List;


public class GenericExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "lmn", "pqr", "xyz");
        System.out.println("Class is to provide : " + list.getClass().getTypeName());
        List<Boolean> list1 = Arrays.asList(true, false, true, 1 < 3, 3.23 > 1.2, 'A' > 'B');
        int count = 0;
        for (Boolean b : list1) {
            if (b == false)
                continue;
            count++;
            System.out.print(" " + b);
        }
        System.out.println("  \n\n  Trueth value returning  " + count + "  time");
        Box<Integer> box = new Box<>(123);
        System.out.println("Item is : " + box.item);
        System.out.println("Function will returns :" + (Integer.parseInt(box.pa1(12)) + 123));

    }
}

class Box<T> {
    T item;

    Box(T p) {
        this.item = p;
    }

    public String pa1(T item) {
        return item.toString();
    }
}


/*
Given Class IS From : java.lang.Integer
 */