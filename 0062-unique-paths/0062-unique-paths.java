class Solution {
    public int uniquePaths(int m, int n) {
        
        
        int dp[] = new int[n] ;
        
        Arrays.fill(dp, 0);
            
        
        for(int i=0 ; i< m ; i++){
             
            int[] temp = new int[n];
            
            for(int j = 0; j<n ; j++){
               
                if(i==0 && j==0){
                    temp[j] = 1;
                }
                else{
                    
                    int right = 0 ;
                    int down = 0 ;
                    if(j>0){
                        right  = temp[j-1] ;
                    }
                    if(i > 0){
                        down = dp[j];
                    }
                    
                    temp[j] = right + down ;
                    
                }
                
            }
            dp = temp ;
        }
        return dp[n-1] ;
    }
}