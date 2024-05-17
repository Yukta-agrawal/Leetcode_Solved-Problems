class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length ;
        int place =0 ;
        for(int i=0 ; i<nums.length; i++){
            if(nums[i]==0){
                if(i<=place){
                    place = i ;
                }
            }
            else{
                nums[place]=nums[i] ;
                place++;
            }
        }
        while(place<n){
            nums[place]=0;
            place++;
        }
    }
}