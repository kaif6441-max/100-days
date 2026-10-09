class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int[] row:dp){
            Arrays.fill(row, -1);
        }

        return fun(0,0,grid,dp);
        
    }
    static int fun(int i,int j, int[][]grid, int dp[][]){
        int m = grid.length;
        int n = grid[0].length;

        if(i== m-1 && j==n-1 ){
            return grid[i][j];
        }
        if(i>=m||j>=n){
            return 1000000000;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = fun(i ,j+1 ,grid ,dp );
        int down = fun(i+1 ,j ,grid ,dp);

        dp[i][j] = grid[i][j]+Math.min(right,down);

        return dp[i][j];

    }
}