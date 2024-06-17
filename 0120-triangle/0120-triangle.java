class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int m = triangle.size();
        
        int dp[][]  = new int[m][m] ;
        
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        
        for(int j = 0 ; j< m ; j++){
            dp[m-1][j] = triangle.get(m-1).get(j);
        }
        
        for(int i=m-2 ; i>= 0 ; i--){
            
            for(int j=i; j>=0 ; j--){
                
                int sum1 = triangle.get(i).get(j) + dp[i+1][j];
                int sum2 = triangle.get(i).get(j) + dp[i+1][j+1];
                dp[i][j] = Math.min(sum1 , sum2) ;
            }

        }
      return dp[0][0];
    
    }
    
//     public int helper(List<List<Integer>> triangle , int row , int col , int m , int[][] dp){
        
//         if(row==m){
//             return 0;
//         }
        
//         if(dp[row][col] != -1){
//             return dp[row][col];
//         }
        
//         int  sum1 = triangle.get(row).get(col) + helper(triangle , row+1 , col , m , dp);
//         int  sum2 = triangle.get(row).get(col) + helper(triangle , row+1 , col+1 , m , dp);
        
//         return dp[row][col] = Math.min(sum1 , sum2);
        
//     }
}