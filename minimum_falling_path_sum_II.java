class Solution {
    int n;
    public int minFallingPathSum(int[][] grid) {
        n = grid.length;
        int dp[][] = new int[n][n];
        //init
        //dp of last row
        for(int col=0;col<n;col++){
            dp[n-1][col] = grid[n-1][col];
        }
    // sloved for n-2 rows
        for(int row=n-2;row>=0;row--){
            for(int col=0; col<n; col++){
                int minVal = Integer.MAX_VALUE;
                for(int nextRowCol = 0; nextRowCol<n;nextRowCol++){
                    if(nextRowCol!= col){
                    minVal = Math.min(minVal,dp[row+1][nextRowCol]);
                    }
                }
                dp[row][col] = grid[row][col] + minVal;
            }
        }
    
        int minVal = Integer.MAX_VALUE;
        for(int col=0; col<n;col++){
            minVal = Math.min(minVal, dp[0][col]);
        }
        return minVal;
    }

}
