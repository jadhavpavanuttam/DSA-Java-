package dynamic_programming;

public class Knapsack {

    static int knapsack(
            int[] weight,
            int[] value,
            int capacity) {
        int n = weight.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weight[i - 1] <= w) {
                    int include = value[i - 1] + dp[i - 1][w - weight[i - 1]];
                    int exclude = dp[i - 1][w];
                    dp[i][w] = Math.max(include, exclude);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weight = {3, 2, 1};
        int[] value = {60, 40, 20};
        int capacity = 5;
        System.out.println(
                knapsack(weight, value, capacity)
        );
    }
}
/**
 * Dynamic Properties.
 * dp[i][w]=dp[i-1][w]
 * contains the actual formula :
 * dp[i][w] = max(dp[i-1][w],v_i+dp[i-1][w-w_i])
 */