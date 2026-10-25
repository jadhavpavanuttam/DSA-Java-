package Java_Basics.Pattern;

public class FindMaxSum {
    public static void main(String[] args) {
        System.out.println("maxSum is : " + subArrMaxSum(new int[]{4, 3, 2, 5, 6, 5, 3, 4, 1}, 7, 4));
    }

    private static int subArrMaxSum(int arr[], int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int j = 0;
            int current_sum = 0;
            while (j < k) {
                current_sum = current_sum + arr[i + j];
                max_sum = Math.max(current_sum, max_sum);
                j++;
            }
        }
        return max_sum;
    }
}
