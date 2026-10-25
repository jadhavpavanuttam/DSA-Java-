package arraySeries;

public class BinarySearch {
    public static void main(String[] args) {
        int s1 = binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3);
        if (s1 < 0)
            System.out.println("Elelent is not found : " + s1);
        else
            System.out.println("Element is foud: " + s1);
    }

    private static int binarySearch(int arr[], int search) {
        int steps = 0;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == search)
                return mid;
            else if (arr[mid] < search)
                l = mid + 1;
            else
                r = mid - 1;
            steps++;
        }
        System.out.println("Step taken Binary Search : " + steps);
        return -1;
    }
}
