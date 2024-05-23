class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>() ;
        int count1 = 0;
        int count2 = 0 ; 
        int ele1 = Integer.MIN_VALUE; 
        int ele2  = Integer.MIN_VALUE;
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            if(count1 == 0 && nums[i]!=ele2){
                count1++;
                ele1 = nums[i];
            }
            else if(count2 == 0 && nums[i]!= ele1){
                count2++;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1){
                count1++;
            }
            else if(nums[i] == ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        } 
        int cnt1 = 0 , cnt2 = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]== ele1)
                cnt1++;
            if(nums[i] == ele2)
                cnt2++;
        }
        
        if(cnt1 > (int)(n/3))
            ls.add(ele1);
        if(cnt2 > (int)(n/3))
            ls.add(ele2);
            
        return ls;
        
    }
}