class Solution {
    public int maxProfit(int[] prices, int fee) {
        
      int n = prices.length;
      int[] dp = new int[2];
    
        for(int i=n-1 ; i>=0 ; i--){

                    int  ibought = -prices[i] + dp[0];
                    dp[1] = Math.max(ibought , 0 + dp[1]);
                
                    int isold = prices[i] - fee + dp[1];
                    dp[0] = Math.max(isold , 0+ dp[0]) ;
        }


        return dp[1];
    }

}