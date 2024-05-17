class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Max=0 , count= 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==1){
                count++;
                Max = Math.max ( Max , count ) ;
            }
            else{
                count=0;
            }
            
        }
        return Max ;
    }
}