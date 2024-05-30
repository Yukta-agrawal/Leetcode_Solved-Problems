class Solution {
    public int rob(int[] nums) {
        
            int a = nums[0] ;
       if(nums.length == 1){
           return a ;
       }
        int b = Math.max(nums[1] , a) ;
        
        
        for(int i=2 ; i < nums.length ; i++){
            
            int take  = nums[i] + a;
            int nottake = b ;
            int c = Math.max(take , nottake) ;
            a = b;
            b = c ;
        }
        
        return b;
        
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