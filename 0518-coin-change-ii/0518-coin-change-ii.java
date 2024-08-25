class Solution {
    public int change(int amount, int[] coins) {

        int dp[][] = new int[coins.length][amount+1]; 
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }

        return helper(coins.length-1 ,amount , coins, dp);
    }

    public int helper(int index,int amount,int[] coins, int[][] dp){

        if(amount==0){
            return 1;
        }
        if(index==0){
            if(amount%coins[0]==0) return 1;
            else return 0;
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }

        int nottake = helper(index-1, amount , coins , dp );
        int take = 0;
        if(coins[index]<=amount){
            take = helper(index, amount-coins[index] , coins, dp);
        }

        return dp[index][amount] = nottake+ take ;
    }
    
}