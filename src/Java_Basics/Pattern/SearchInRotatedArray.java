package Java_Basics.PatternPrinting;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        int key = 8;

        int index = search(arr, key);
        System.out.println(index);
    }

    private static int search(int[] arr, int key) {
        int n = arr.length;
        int pivot = getPivot(arr, 0, n - 1);
        // If array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, 0, n - 1, key);
        }

        // If key is at pivot
        if (arr[pivot] == key) {
            return pivot;
        }

        // Decide which side to search
        if (key >= arr[0]) {
            return binarySearch(arr, 0, pivot - 1, key);
        }

        return binarySearch(arr, pivot + 1, n - 1, key);
    }

    private static int getPivot(int[] arr, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mid < r && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > l && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] >= arr[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
