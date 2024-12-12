class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int n = prices.length;
        int[] dp = new int[2];
    
        for(int i=n-1 ; i>=0 ; i--){
            dp[1] = Math.max(-prices[i] + dp[0], 0 + dp[1]);
            dp[0] = Math.max(prices[i] - fee + dp[1] , 0+ dp[0]) ;
        }

        return dp[1];
    }

}