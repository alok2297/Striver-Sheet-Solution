import java.util.Scanner;

public class StockBuySellDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Brute Force Profit: " + BruteStockBuySell.maxProfitBrute(prices));
        System.out.println("Brute Force Profit: " + BetterStockBuySell.maxProfitBetter(prices));
        System.out.println("Brute Force Profit: " + OptimalStockBuySell.maxProfitOptimal(prices));
    }
}