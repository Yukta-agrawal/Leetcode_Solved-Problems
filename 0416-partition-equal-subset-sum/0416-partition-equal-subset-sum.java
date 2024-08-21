class Solution {
    public boolean canPartition(int[] nums) {
        int N = nums.length ;
        
        int sum = 0 ;
        for(int i = 0 ; i< N  ; i++){
            sum += nums[i] ;
        }
        if(sum%2 !=0){
            return false;
        }
        boolean dp[][] = new boolean[N][sum/2 + 1] ;
    
        for(int i = 0 ; i< N ; i++){
            dp[i][0] = true ;
        }

        if (nums[0] <= sum/2) {
                dp[0][nums[0]] = true;
        }
        
        for(int ind = 1 ; ind <N ; ind++ ){
            for(int tar = 0 ; tar <= sum/2 ; tar++){

               boolean nottake  = dp[ind -1][tar]; 
               boolean take = false;
               if (nums[ind] <= tar) 
                    take = dp[ind -1][tar - nums[ind]] ;

                 dp[ind][tar] = take || nottake ;
            }
        }
        
        return dp[N-1][sum/2];
        
    }
    
//     public boolean helper(int[] nums , int ind , int tar , int[][] dp){
//         if(tar == 0){
//             return true ;
//         }
//         if(ind == 0 ){
//             return nums[0]==tar ;
//         }
        
//         if(dp[ind][tar] != -1){
//             return dp[ind][tar]==1 ? true : false ;
//         }
        
        
//        boolean nottake  = helper(nums , ind -1 , tar , dp); 
//        boolean take = false;
//        if (nums[ind] <= tar) 
//             take = helper(nums , ind -1 , tar - nums[ind] , dp);
        
//          dp[ind][tar] = take || nottake ? 1 : 0 ;
//         return  take || nottake ;
//     }
    
}