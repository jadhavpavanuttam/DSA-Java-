package arraySeries;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Element is Found :" + binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 7, 0, 9));
    }

    //by using recursion method
    private static int binarySearch(int arr[], int search, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[mid] == search)
            return arr[mid];
        else if (arr[mid] < search)  //  mid  < target
            return binarySearch(arr, search, mid + 1, right);
        else
            return binarySearch(arr, search, left, mid - 1);
    }
}
