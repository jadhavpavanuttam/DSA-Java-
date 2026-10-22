package JavaDsa;

import java.util.HashSet;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6, 2, 12 , 5, 1, 2, 43, 3, 9, 8, 4};
        HashSet<Integer> integers = new HashSet<>();
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        for (int x : arr) {
            integers.add(x);
//            System.out.print(x + " ");
        }
        System.out.println(integers);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy left array
        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[l + i];
        }

        //FIXED: Copy right array properly
        for (int j = 0; j < n2; j++) {
            rArr[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        // Merge arrays
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        // Remaining elements
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}







/*
public class MergeSort {
    public static void main(String[] args) {
        for (int x : mergeSort(new int[]{62, 125, 1, 243, 3, 98, 4}, 0, 6))
            System.out.println(x + " ");
    }

    private static int[] mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    private static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x=0;x<n1;x++)
        {
    lArr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++)
        {
    rArr[x]=arr[m+1];
        }
        int i=0,j=0,k=l;
        while (i<n1 && j<n2)
        {
            if(lArr[i]<rArr[j])
            {
                arr[k]=lArr[i];
                i++;
            }
            else
            {
                arr[k]=rArr[j];
                j++;;
            }
            k++;
        }
        while (i<n1)
        {
            arr[k]=lArr[i];
            i++;
            k++;

        }

        while (j<n2)
        {
            arr[k]=rArr[j];
            j++;
            k++;
        }
    }

}
*/