class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[][] = new int[coins.length][amount+1];
    
        for(int a=0 ; a<= amount ; a++){
            if(a % coins[0]==0) 
                dp[0][a] = a/ coins[0] ;
            else
                dp[0][a] = (int)1e9 ;
        }

        for(int i=1 ; i<coins.length ; i++){
            for(int a = 0; a<= amount ; a++){

                int nottake = 0 + dp[i-1][a] ;
                int take = Integer.MAX_VALUE;
                if(a-coins[i]>=0){
                    take = 1 + dp[i][a-coins[i]];
                }
                dp[i][a] = Math.min(nottake , take);
            }
        }


        int r =  dp[coins.length - 1][amount];
        if(r== (int)1e9){
            return -1;
        }
        else
            return r;
    }

}