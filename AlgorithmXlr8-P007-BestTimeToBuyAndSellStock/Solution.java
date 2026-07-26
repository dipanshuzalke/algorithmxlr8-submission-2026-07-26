import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] prices = new long[n];
        for (int i = 0; i < n; i++) prices[i] = sc.nextLong();

        long maxProfit = 0;
        long buyPrice = prices[0];

        for(int i =1; i<prices.length; i++) {
            if(prices[i] > buyPrice) {
                long profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        System.out.println(maxProfit);
    }
}
