package JavaDsa;

public class SelectionSort {
    public static void main(String[] args) {

        for (int x : selectionSort(new int[]{7, 6, 5, 3, 2, 1, 9}))
            System.out.print(" " + x);
    }

    private static int[] selectionSort(int arr[]) {
        System.out.println("Before Sorting Array is : ");
        for (int x : arr)
            System.out.print(" " + x);
        System.out.println("\n_________________________");
        if (arr.length == 0)
            return new int[]{};
        sort(arr);
        return arr;
    }

    private static void sort(int arr[]) {
        int i = 0;
        int minIndex = -1, temp;

        while (i < arr.length - 1) {
            int j = i + 1;
            minIndex = i;
            while (j < arr.length-1) {
                if (arr[minIndex] > arr[j]) {  //arr[0] >arr[1] => swap()
                    minIndex = j;  // minIndex=1 -> 0
                }
                j++;  //j = 1
//                System.out.print(arr[i]);
            }
            temp = arr[minIndex];  //temp = 6
            arr[minIndex] = arr[i];
            arr[i] = temp;   //arr[]
            i++;
    for(int n1:arr)
    System.out.print(" "+n1);
            System.out.println();
        }
        System.out.println("_________________________");
        System.out.println("After Sorting : ");
        System.out.println("_________________________");

    }
}


/*

Output is :

Before Sorting Array is :
 7 6 5 3 2 1 9
After Sorting Array Is :
 1 2 3 5 6 7 9

 */