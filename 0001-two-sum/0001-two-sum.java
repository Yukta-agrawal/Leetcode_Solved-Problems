class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0; 
        int[] ans = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            sum = nums[i];
            
            if(map.containsKey(target-sum)){
                ans[0] = i ; 
                ans[1] = map.get(target-sum);
                return ans ;
            }
            map.put(sum , i);
            
        }
        return ans;
    }
}