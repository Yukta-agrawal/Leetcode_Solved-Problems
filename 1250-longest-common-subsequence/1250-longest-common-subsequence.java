class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int dp[][] = new int[n1+1][n2+1];
        // for(int[] row: dp){
        //     Arrays.fill(row , -2);
        // }

        for(int ind1=1 ; ind1<= n1; ind1++){
            for(int ind2=1 ; ind2 <= n2 ; ind2++){
                
                if(text1.charAt(ind1-1)==text2.charAt(ind2-1)){
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                }
                else
                dp[ind1][ind2] =Math.max( dp[ind1][ind2-1] , dp[ind1-1][ind2] );

            }
        }
        return dp[n1][n2] ;

    }

    // public int helper(int ind1 , int ind2 , String text1, String text2 , int[][] dp){

    //     if(ind1==0 || ind2==0){
    //         return 0;
    //     }

    //     if(dp[ind1][ind2]!=-2){
    //         return dp[ind1][ind2];
    //     }

    //     if(text1.charAt(ind1-1)==text2.charAt(ind2-1)){
    //         return dp[ind1][ind2] = 1 + helper(ind1-1 , ind2-1 , text1 , text2 , dp);
    //     }

    //     dp[ind1][ind2] =Math.max( helper(ind1 , ind2-1 , text1 , text2 , dp) , helper(ind1-1 , ind2 , text1 , text2 , dp) );
    //     return dp[ind1][ind2];
    // }
}