class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int right = 0 , left = 0 , len = 0 , zeros = 0 , maxlen = 0;
        
        while(right < nums.length){
            
            if(nums[right]==0) zeros++ ;
            
            if(zeros>k){
                if(nums[left]==0){
                    zeros-- ;
                }
                left++;
            }
            
            if(zeros<=k){
                len = right - left + 1 ;
                maxlen = Math.max( maxlen , len ) ;
            }
            right++ ;
            
        }
        return maxlen ;
        
    }
}