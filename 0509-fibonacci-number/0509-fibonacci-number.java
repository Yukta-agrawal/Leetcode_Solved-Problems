class Solution {
    public int fib(int n) {
        
        return helper(n) ;
        
    }
    
    public int helper(int n){
        
        if(n==0 || n== 1){
            return n ;
        }
        
        return helper(n-2) + helper(n-1) ;
    }
}