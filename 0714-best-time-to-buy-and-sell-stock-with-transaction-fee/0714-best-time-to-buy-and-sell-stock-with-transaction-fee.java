class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int n = prices.length;
      int[] dp = new int[2];
    
        for(int i=n-1 ; i>=0 ; i--){
            for(int buy = 0 ; buy<=1 ; buy++){

                int profit = 0;
                if(buy==1){
                    int  ibought = -prices[i] + dp[0];
                    profit = Math.max(ibought , 0 + dp[1]);
                }
                else{
                    int isold = prices[i] - fee + dp[1];
                    profit = Math.max(isold , 0+ dp[0]) ;
                }
                dp[buy] = profit;

            }
        }


        return dp[1];
    }

    public int helper(int i , int buy , int[] prices , int[][] dp , int fee){

        if(i== prices.length){
            return 0;
        }

        if(dp[i][buy]!= -1){
            return dp[i][buy]; 
        }

        int profit = 0;
        if(buy==1){
            int  ibought = -prices[i] + helper(i+1 , 0 , prices , dp , fee);
            profit = Math.max(ibought , 0 + helper(i+1 , 1 , prices , dp , fee));
        }
        else{
            int isold = prices[i] - fee + helper(i+1 , 1 , prices , dp , fee);
            profit = Math.max(isold , 0+helper(i+1 , 0 , prices , dp , fee) ) ;
        }

        return dp[i][buy] = profit;

    }

}