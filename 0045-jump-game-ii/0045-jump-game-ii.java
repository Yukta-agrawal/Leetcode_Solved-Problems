class Solution {
    
    public int jump(int[] nums) {
        int n = nums.length;
        
        int dp[] = new int[10001];
        
        Arrays.fill(dp, 10001);
        
        return (solve(nums , 0 , dp));
        
       
    }
    
    
    
    public int solve(int arr[] ,int pos, int dp[]){
        
        if(pos >= arr.length -1){
            return 0;
        }
        
        if(dp[pos]!=10001){
            return dp[pos];
        }
        
        int minjumps = 10001 ; 
        
        for(int i=1 ; i<=arr[pos] ; i++){
            
            dp[pos] = Math.min( dp[pos] , 1 + solve(arr , pos+i , dp ) ) ; 
            
            // minjumps = Math.min( minjumps , 1 + solve(arr , pos+i ));
        }
        return dp[pos];
        
    } 
        
}



//     recursive
 
//     public int solve(int arr[] ,int pos){
        
//         if(pos >= arr.length -1){
//             return 0;
//         }
        
//         int minjumps = 10001 ; 
        
//         for(int i=1 ; i<=arr[pos] ; i++){
//             minjumps = Math.min( minjumps , 1 + solve(arr , pos+i ));
            
//         }
//         return minjumps;
        
//     } 