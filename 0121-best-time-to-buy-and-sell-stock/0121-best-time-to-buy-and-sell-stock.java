class Solution {
    public int maxProfit(int[] prices) {

        int profit  = 0;
        int minprice = prices[0];

        for(int i=1 ; i<prices.length ; i++){
            profit = Math.max(profit , prices[i]- minprice);
            minprice = Math.min(minprice , prices[i]);
        }

        return profit;
        
    }
}