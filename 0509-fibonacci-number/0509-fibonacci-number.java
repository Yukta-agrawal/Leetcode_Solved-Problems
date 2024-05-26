class Solution {
    
    public static int[] dp = new int[31];
    static{
        Arrays.fill(dp , -1) ;
    }
    public int fib(int n) {
        if(n<=1){
            return n ;
        }
      
        if(dp[n] != -1){
            return dp[n];
        }
        
        dp[n] = fib(n-1) + fib(n-2) ;
              
        return dp[n] ;
       
    }
   
    
}


// simple recursion
    
//         if(n==0 || n== 1){
//             return n ;
//         }
        
//         return fib(n-2) + fib(n-1) ;


// top down (Hashmap)