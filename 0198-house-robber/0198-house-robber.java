class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int dp[] = new int[n];
        
        dp[0] = nums[0];

        int prev1 = nums[0];
        int prev2 = 0 ;

        for(int i=1 ; i<n ; i++){

            int notpick = 0 + prev1;
            int pick = nums[i];
            if(i>1){
                pick = pick + prev2;
            }
            int curr =  Math.max(pick , notpick);

            prev2 = prev1;
            prev1 = curr;

        }

        return prev1;
    }

    // public int helper(int i , int[] nums , int[] dp ){

    //     if(i==0){
    //         return nums[i];
    //     }

    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }

    //     int notpick = 0 + helper(i-1 , nums , dp);
    //     int pick = nums[i];
    //     if(i>1){
    //         pick = pick + helper(i-2 , nums , dp);
    //     }
    //     return dp[i] =  Math.max(pick , notpick);
    // }
    
    
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