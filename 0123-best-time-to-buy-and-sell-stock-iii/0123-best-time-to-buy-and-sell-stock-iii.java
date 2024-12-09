class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][3];

        // for(int[][] d:dp){
        //     for(int[] p : d){
        //         Arrays.fill(p , -1);
        //     }
        // }
        // for(int cap = 0 ; cap<=2 ; cap++){
        //     dp[n][0][cap] = 0 ;
        //     dp[n][1][cap] = 0 ;
        // }

        // for(int i=0 ; i<=n  ; i++){
        //     dp[i][0][0] = 0;
        //     dp[i][1][0] = 0;

        // }
        
        for(int i = n-1 ; i>= 0 ; i-- ){
            for(int buy = 0 ; buy<=1 ; buy++){
                for(int cap = 1 ; cap<=2 ; cap++){

                    int profit = 0;
                    if(buy==1){
                        int ibought = -prices[i] + dp[i+1][0][cap];
                        profit = Math.max(ibought , 0 + dp[i+1][1][cap]);
                    }
                    else{
                        int isold = prices[i] + dp[i+1][1][cap-1];
                        profit = Math.max(isold , 0+dp[i+1][0][cap]);
                    }

                    dp[i][buy][cap] = profit;

                }
            }
        }

        return dp[0][1][2] ;

    }

    public int helper(int i , int buy , int cap, int[] prices , int[][][] dp){
        
        if(cap==0){
            return 0;
        }

        if(i== prices.length){
            return 0;
        }

        if(dp[i][buy][cap] != -1){
            return dp[i][buy][cap] ;
        }

        int profit = 0;
        if(buy==1){
            int ibought = -prices[i] + helper(i+1 , 0 , cap , prices , dp);
            profit = Math.max(ibought , 0 + helper(i+1 , 1 , cap , prices , dp));
        }
        else{
            int isold = prices[i] + helper(i+1 , 1 , cap-1 , prices , dp);
            profit = Math.max(isold , 0+helper(i+1 , 0 , cap , prices , dp));
        }

        return dp[i][buy][cap] = profit;

    }
}