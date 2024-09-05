class Solution {
    public boolean canJump(int[] nums) {
       int n = nums.length;
       int j=0;
        int maxi = 0;
        while(j<n){
            maxi = Math.max(maxi , j+nums[j]);
            if(maxi>=n-1){
                return true;
            }
            if(j+1 <= maxi){
                j++;
            } 
            else{
                return false;
            }
        }
        return false;
    }
}