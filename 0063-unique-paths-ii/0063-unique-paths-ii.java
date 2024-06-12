class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        
        int dp[] = new int[n];
        Arrays.fill(dp , 0);
        
        for(int i = 0 ; i< m ; i++){
            int temp[] = new int[n]; 
            
            for(int j = 0 ; j < n ; j++){
                if(i==0 && j==0 && obstacleGrid[i][j]==1 ){
                    temp[j] = 0;
                    continue;
                } 
                
                if(i==0 && j==0){
                    temp[j] = 1;
                    continue;
                } 
                
                int left=0 ;
                 int up = 0;
                
                if(i>0){
                   if(obstacleGrid[i][j]!=1)
                        up = dp[j];
                    else
                        up = 0; 
                }
                if(j>0){
                    if(obstacleGrid[i][j]!=1)
                        left = temp[j-1];
                    else
                        left = 0;
                }
                
                temp[j]= left + up;
                
                
            }
            dp = temp ;
            
        }
        return dp[n-1];
        
        
    }
}