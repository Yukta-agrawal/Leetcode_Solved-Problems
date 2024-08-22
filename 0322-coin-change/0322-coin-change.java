class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[][] = new int[coins.length][amount+1];
        for(int[] row: dp){
            Arrays.fill(row , -1);
        }

        int r = helper(coins.length - 1 , coins , amount , dp);
        if(r== (int)1e9){
            return -1;
        }
        else
         return r;
    }

    public int helper(int i , int[] coins, int amount ,int dp[][]){
        if(i==0){
            if(amount%coins[i]==0) return amount/coins[i];
            else return (int)1e9;
        }

        if(dp[i][amount]!= -1){
            return dp[i][amount] ;
        }

        int nottake = 0 + helper(i-1 , coins , amount , dp);
        int take = Integer.MAX_VALUE;
        if(amount-coins[i]>=0){
            take = 1 + helper(i , coins , amount-coins[i] , dp);
        }

        return dp[i][amount] = Math.min(nottake , take);
        //  dp[i][amount] ;

    }
}