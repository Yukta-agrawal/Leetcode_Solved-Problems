class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
       int n = nums.length ;
        
        
        for(int i = 0 ; i< (1 << n) ; i++ ){
             List<Integer>  list = new ArrayList<Integer>() ;
            
            for(int j = 0; j< n ; j++){
                if((i & (1<< j)) !=0 ){
                    list.add(nums[j]);
                }
                
            }
            ans.add(list) ;
        }

        return ans ;
        
    }
}
    
    
//     public void helper(int index ,int[] nums , List<List<Integer>> ans , List<Integer> list ){
        
        
//         if(index >= nums.length) {
//             ans.add(new ArrayList<>(list)) ;
//             return ;
//         }

//         list.add(nums[index]);
        
//         helper(index + 1 , nums , ans , list);
        
//         list.remove(list.size() -1);
        
//         helper(index + 1 , nums , ans , list);
 
//     }
    
// }