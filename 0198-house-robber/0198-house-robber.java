class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp ,-1) ;
        dp[0] = nums[0] ;
        int take = Integer.MIN_VALUE ;
        for(int i=1 ; i < nums.length ; i++){
           if(i> 1){
                take  = nums[i] + dp[i-2] ;
           }
            else{
                take = nums[i];
            }
            int nottake = dp[i-1] ;
            dp[i] = Math.max(take , nottake) ;
        }
        
        
        return dp[nums.length -1];
        
    }
    
    
//     public int helper(int index , int[] nums , int[] dp){
         
//         if(index ==0){
//             return nums[0] ;
//         }
        
//         if(index < 0){
//             return 0;
//         }
        
//         if(dp[index] != -1){
//             return dp[index] ;
//         } 
        
        
//         int take = nums[index] + helper(index - 2 , nums , dp);
//         int nottake =0 + helper(index - 1 , nums , dp) ;
        
//         dp[index] =  Math.max(take , nottake) ;
//         return dp[index] ;
        
//     }
    
}