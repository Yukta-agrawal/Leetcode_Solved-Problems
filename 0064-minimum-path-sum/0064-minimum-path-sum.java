class Solution {
    public int minPathSum(int[][] grid) {
        
        int m = grid.length ;
        int n = grid[0].length ;
        int[] prev = new int[n];
        Arrays.fill(prev , 0) ;
        
        for(int i=0 ; i<m ; i++){
            int[] temp = new int[n];
            
            for(int j=0; j <n ; j++){
                if(i==0 && j==0){
                    temp[j] = grid[i][j] ;
                    continue;
                }
                
                int leftsum = Integer.MAX_VALUE;
                int upsum = Integer.MAX_VALUE;
                if(i>0){
                    upsum = prev[j] + grid[i][j];

                }
                if(j>0){
                    leftsum =  temp[j-1] + grid[i][j];

                }
                temp[j] = Math.min(leftsum , upsum) ;
                
            }
            prev = temp ;
        }
        
        return prev[n-1];
    }
}