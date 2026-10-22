package JavaDsa;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PrimitiveIterator;

public class QuickSort {
    public static void main(String[] args) {

        HashSet<Integer> objects = new HashSet<>();
        int[] ints = {11, 8, 7, 6, 3, 4, 4, 4, 5, 2, 2, 9, 1, 10};
        System.out.println("Before Sorting Arrays Is : ");
        PrimitiveIterator.OfInt iterator = Arrays.stream(ints).iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (i == 0 || i == ints.length - 1) {
                String s1 = " , ";
                s1.replace(s1, "");
                System.out.print(iterator.next() + s1);
            }
        }
        System.out.println("\n");
        for (int x : quickSortDemo(ints))
            objects.add(x);
        pa1();
//        for (int x : new int[]{4, 34, 5, 56, 7567, 0, 87, 98, 9, 99}) {
//            objects.add(i);
//            System.out.printf("x = %d\n", x);
//        }
    }

    private static void pa1() {
        System.out.println("This is the program for educational purpose.");
        return;
    }

    private static int[] quickSortDemo(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);   //recursive function
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                System.out.printf("i=%d , j=%d\n", i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int @NotNull [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


/*
        System.out.printf("Name  : %s  ,  Age : %d ,Salery : %d","pavan",23,1500000);
        int i=0;
        for (int[] ints : Arrays.asList(quickSortDemo(new int[]{11, 8, 7, 6, 3, 4, 4, 4, 5, 2, 2, 9, 1}))) {
            i++;
            System.out.print(i+" : "+ints[i]);
        }
 */

/*
String s1="pavan";
String s2="jadhav:
s1+s2 combining after i want output  jpaadvhaanv ;

 */