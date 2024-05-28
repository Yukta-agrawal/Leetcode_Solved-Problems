class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  list = new ArrayList<Integer>() ;
        helper(0 , nums , ans , list);
        return ans ;
        
    }
    
    
    public void helper(int index ,int[] nums , List<List<Integer>> ans , List<Integer> list ){
        
        
        if(index >= nums.length) {
            ans.add(new ArrayList<>(list)) ;
            return ;
        }

        list.add(nums[index]);
        
        helper(index + 1 , nums , ans , list);
        
        list.remove(list.size() -1);
        
        helper(index + 1 , nums , ans , list);
 
    }
    
}