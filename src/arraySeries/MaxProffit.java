package arraySeries;

public class MaxProffit {
    public static void main(String[] args) {
        System.out.println("Maximum profit is : " + maxProfit(new int[]{1, 5, 23, 435, 5}));
    }

    static long maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int minPrice = prices[0];
        long profit = 0;

        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, (long) prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return profit;
    }
}
