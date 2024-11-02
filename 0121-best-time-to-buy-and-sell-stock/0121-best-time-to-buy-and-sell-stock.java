class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxprofit = 0;
        for(int i=1 ;i<prices.length ; i++){
            maxprofit = Math.max(maxprofit , prices[i] - mini);
            mini = Math.min(mini , prices[i]);
        }
        return maxprofit;
    }
}