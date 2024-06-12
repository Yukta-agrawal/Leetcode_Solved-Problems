class Solution {
    public int uniquePaths(int m, int n) {
        
        
        int dp[][] = new int[m][n] ;
        
        for(int[] row : dp ){
            Arrays.fill(row , -1);
            
        } 
        return helper(m-1 , n-1 , dp);
        
    }
    
    
    public int helper(int left , int up , int[][] dp){
        
      
        if(left==0 && up==0 ){
            return 1;
        }
        
        if(left<0 || up<0){
            return 0 ;
        }
        
        if(dp[left][up] != -1){
            return dp[left][up] ;
        }
        
        
         dp[left][up] = helper(left-1 , up , dp) +  helper(left , up-1 , dp );
         return  dp[left][up] ;
    }
    
}