class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int n = prices.length;
        int dp[][] = new int[n][2] ;
        for(int[] d: dp){
            Arrays.fill(d , -1);
        }
        return helper(0 , 1 , prices , dp , fee);

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