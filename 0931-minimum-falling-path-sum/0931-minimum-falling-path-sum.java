class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        int[] dp = new int[n];
        
        // Initialize the dp array with the first row of the matrix
        for (int i = 0; i < n; i++) {
            dp[i] = matrix[0][i];
        }
        
        // Iterate over the matrix rows starting from the second row
        for (int i = 1; i < n; i++) {
            int[] temp = new int[n];
            
            for (int j = 0; j < n; j++) {
                // Take the element directly above
                temp[j] = dp[j] + matrix[i][j];
                
                // If there is a left diagonal element, take the minimum
                if (j > 0) {
                    temp[j] = Math.min(temp[j], dp[j - 1] + matrix[i][j]);
                }
                
                // If there is a right diagonal element, take the minimum
                if (j < n - 1) {
                    temp[j] = Math.min(temp[j], dp[j + 1] + matrix[i][j]);
                }
            }
            
            // Update dp array with the values of the current row
            dp = temp;
        }
        
        // Find the minimum value in the last row of dp array
        for (int i = 0; i < n; i++) {
            min = Math.min(min, dp[i]);
        }
        
        return min;
    }
}
