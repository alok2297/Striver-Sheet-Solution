public class BruteStockBuySell {
    public static int maxProfitBrute(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
