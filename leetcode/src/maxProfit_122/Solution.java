package maxProfit_122;

/**
 * Created by Apple on 2/14/17.
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            // if next price is higher than current price, log the difference and add to total
            if (prices[i + 1] > prices[i]) total += prices[i + 1] - prices[i];
        }
        return total;
    }
}
