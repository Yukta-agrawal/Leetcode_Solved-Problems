class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] row: dp){
            Arrays.fill(row ,  -1) ;
        }
        return helper(nums , 0 , -1 , n , dp);
        
    }
    
    
    public int helper(int[] nums ,int ind , int prev , int n , int[][] dp){
        
        if(ind == n){
            return 0;
        }
        
        if(dp[ind][prev+1] != -1 )  {
            return dp[ind][prev+1] ;
        }
        
        
        int nottake = 0 + helper(nums , ind+1 , prev , n , dp );
        int take = 0;
        if(prev== -1 || nums[ind] > nums[prev]){
            take = 1 + helper(nums , ind + 1 , ind , n , dp);
        }
        
        return dp[ind][prev+1] = Math.max(nottake , take) ;
    }
}