class Solution {
    public int change(int amount, int[] coins) {

        int dp[][] = new int[coins.length][amount+1]; 
        
        for(int i=0; i<coins.length ; i++){
            dp[i][0] = 1;
        }


        for(int am=1 ; am<=amount ; am++){
            if(am%coins[0]==0)
                dp[0][am] = 1;
        }

        
        

        for(int i=1 ; i<coins.length ; i++){
            for(int a=1; a <=amount ; a++){
                int nottake = dp[i-1][a];
                int take = 0;
                if(coins[i]<=a){
                    take = dp[i][a-coins[i]];
                }

                dp[i][a] = nottake+ take ;
            }
        }

        return dp[coins.length-1][amount] ;
    }

    // public int helper(int index,int amount,int[] coins, int[][] dp){

    //     if(amount==0){
    //         return 1;
    //     }
    //     if(index==0){
    //         if(amount%coins[0]==0) return 1;
    //         else return 0;
    //     }
    //     if(dp[index][amount]!=-1){
    //         return dp[index][amount];
    //     }

    //     int nottake = helper(index-1, amount , coins , dp );
    //     int take = 0;
    //     if(coins[index]<=amount){
    //         take = helper(index, amount-coins[index] , coins, dp);
    //     }

    //     return dp[index][amount] = nottake+ take ;
    // }
    
}