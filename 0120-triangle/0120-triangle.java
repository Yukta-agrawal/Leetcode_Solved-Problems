class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int m = triangle.size();
        
        int dp[][]  = new int[m][m] ;
        
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return helper(triangle , 0 , 0 , m , dp);
    
        
        
        
    }
    
    public int helper(List<List<Integer>> triangle , int row , int col , int m , int[][] dp){
        
        if(row==m){
            return 0;
        }
        
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        
        int  sum1 = triangle.get(row).get(col) + helper(triangle , row+1 , col , m , dp);
        int  sum2 = triangle.get(row).get(col) + helper(triangle , row+1 , col+1 , m , dp);
        
        return dp[row][col] = Math.min(sum1 , sum2);
        
    }
}