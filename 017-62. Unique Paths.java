//Iterative Dynamic Programming

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i ==0 || j==0) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

/*
Time Complexity:

The code uses a dynamic programming approach to compute the number of unique paths.
It iterates over each cell of the dp array once, filling it with the number of unique paths to reach that cell.
Since there are m rows and n columns, the nested loops iterate m * n times.
Within each iteration, the code performs constant-time operations.
Therefore, the overall time complexity is O(m * n).

Space Complexity:

The space complexity is determined by the space used to store the dp array.
The size of the dp array is m rows by n columns.
Thus, the space complexity is O(m * n) since it directly scales with the input size.
In summary:

Time Complexity: O(m * n)
Space Complexity: O(m * n)
*/
