package leetcode_train;

/**
 * Created by EVERCX on 2018/4/9.
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int currentPrice = Integer.MAX_VALUE;

        for(int i = 0;i < prices.length;i++){
            currentPrice = Math.min(currentPrice,prices[i]);
            profit = Math.max(profit,prices[i] - currentPrice);

        }

        return profit;

    }


    public static void main(String[] args) {


    }

}
