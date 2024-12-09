class Solution {
    public int maxProfit(int k, int[] prices) {
         int n = prices.length;
        int dp[][] = new int[2][k+1];

        
        for(int i = n-1 ; i>= 0 ; i-- ){
            for(int buy = 0 ; buy<=1 ; buy++){
                for(int cap = 1 ; cap<=k ; cap++){

                    int profit = 0;
                    if(buy==1){
                        int ibought = -prices[i] + dp[0][cap];
                        profit = Math.max(ibought , 0 + dp[1][cap]);
                    }
                    else{
                        int isold = prices[i] + dp[1][cap-1];
                        profit = Math.max(isold , 0+dp[0][cap]);
                    }

                    dp[buy][cap] = profit;

                }
            }
        }

        return dp[1][k] ;

    }

}