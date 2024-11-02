class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }

        return Math.max(helper(nums ,  0 , n-2) , helper(nums , 1 , n-1)) ;
     
    }

    public int helper(int[] nums , int start , int end){
        int n = nums.length;
        int prev1 = nums[start];
        int prev2 = 0 ;

        for(int i=start+1 ; i<=end ; i++){

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

}