class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);

        for(int i=0 ; i<=(n-1)/2 ; i++){
            int a = nums[i] ;
            nums[i] = nums[n-1-i] ;
            nums[n-1-i] = a;
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(nums[i]+" ");
        }

        return helper(n-1 , nums , dp);
    }

    public int helper(int n ,int[] nums , int dp[]){
        
        if(n==0){
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int mini = 1000001;
        for(int k=nums[n] ; k>0 ; k--){
            if(n-k>=0){
                int r = 1 + helper(n-k,nums , dp);
                mini = Math.min(r , mini);
            }
        }
        return dp[n] = mini;
        
    }
}  


















    
  //         dp
//         int n = nums.length;  
//         int dp[] = new int[10001];       
//         Arrays.fill(dp, 10001);       
//         return (solve(nums , 0 , dp));
          
//     // dp
//     public int solve(int arr[] ,int pos, int dp[]){
        
//         if(pos >= arr.length -1){
//             return 0;
//         }
//         f
//         if(dp[pos]!=10001){
//             return dp[pos];
//         }
        
//         int minjumps = 10001 ; 
        
//         for(int i=1 ; i<=arr[pos] ; i++){
            
//             dp[pos] = Math.min( dp[pos] , 1 + solve(arr , pos+i , dp ) ) ; 
            
//         }
//         return dp[pos];
//     } 
        
// }



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