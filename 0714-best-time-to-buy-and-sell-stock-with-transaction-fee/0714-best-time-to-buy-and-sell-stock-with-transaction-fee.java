class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int buyprice = -prices[0];
        int sellprice = 0;
        for(int i = 1 ; i< prices.length ; i++){
            buyprice = Math.max(buyprice  , sellprice - prices[i]);
            sellprice = Math.max (sellprice , buyprice + prices[i] - fee);
            // System.out.print(buyprice +" " + sellprice + " ");
        }
        return sellprice;
    }
}