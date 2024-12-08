class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2] ;
        for(int[] d: dp){
            Arrays.fill(d , -1);
        }
        return helper(0 , 1 , prices , dp);
    }

    public int helper(int i , int buy , int[] prices , int[][] dp){

        if(i== prices.length){
            return 0;
        }

        if(dp[i][buy]!= -1){
            return dp[i][buy]; 
        }

        int profit = 0;
        if(buy==1){
            int  ibought = -prices[i] + helper(i+1 , 0 , prices , dp);
            profit = Math.max(ibought , 0 + helper(i+1 , 1 , prices , dp));
        }
        else{
            int isold = prices[i] + helper(i+1 , 1 , prices , dp);
            profit = Math.max(isold , 0+helper(i+1 , 0 , prices , dp) ) ;
        }

        return dp[i][buy] = profit;
        

        // if(prices[i] - prices[prev]>0){
        //     int bought = (prices[i] - prices[prev]) +  helper(i+1 , prev , prices);
        // }

        // return Math.max(notbought , bought);
        
    }
}