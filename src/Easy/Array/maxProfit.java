package Easy;

/**
 * Created by EVERCX on 2017/8/9.
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);
            profit = Math.max(profit,prices[i]-minPrice);
        }

        return profit;

    }
}
