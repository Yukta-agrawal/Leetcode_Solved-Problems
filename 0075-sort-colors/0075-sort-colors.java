class Solution {
    public void sortColors(int[] nums) {
        int low = 0 ;
        int high = nums.length -1 ;
        int i =0 ;
        while(i<=high){
            if(nums[i]==0){
                nums[i] = nums[low] ;
                nums[low] = 0 ;
                low++;
                i++;
               
            }
            else if(nums[i]==1){
                i++;
               
            }
            else{
                nums[i] = nums[high];
                nums[high] = 2;
                high--;
                 
            }
        }
    }
}