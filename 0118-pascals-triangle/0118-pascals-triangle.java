class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<List<Integer>> ans = new ArrayList<>();
        
        
        for(int i = 1 ; i <= numRows ; i++){
            ans.add(rowy(i));
        }
            return ans ;
    }
        
    

    public List<Integer> rowy (int n){
        
        List<Integer> part = new ArrayList<>();
        int ans = 1;
        part.add(ans);
        for(int i = 1 ; i < n ; i++){
            ans = ans * (n - i) ;
            ans = ans / i ;
            part.add(ans);
        }
        
        return part ;
        
    }
}