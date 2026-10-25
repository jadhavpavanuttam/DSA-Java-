package Java_Basics.Pattern;

public class AtMostK0 {
    public static void main(String[] args) {
        System.out.println("MAX ONCE IS : " + longestOnes(new int[]{1, 0, 1, 1, 1, 0, 1}, 2));
    }

    private static int longestOnes(int[] A, int k) {
        int left = 0;
        int ans = 0;
        int window = 0;
        int n = A.length;
        for (int right = 0; right < n; right++) {
            window = window + A[right];
            while (window + k <= right - left + 1) {
                window -= A[left++];
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
