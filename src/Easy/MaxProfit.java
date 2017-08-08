package Easy;

/**
 * Created by EVERCX on 2017/8/8.
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {

        int res = 0;

        for(int i = 1; i <prices.length;i++){
            if(prices[i] > prices[i - 1]){
                res += prices[i] - prices[i-1];
            }
        }
        return res;

    }

}
