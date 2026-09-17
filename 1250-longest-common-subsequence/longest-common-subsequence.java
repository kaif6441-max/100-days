class Solution {

    public int fun(String t1, String t2, int i, int j, int[][] dp) {

        int n1 = t1.length();
        int n2 = t2.length();

        if (i >= n1 || j >= n2)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (t1.charAt(i) == t2.charAt(j)) {

            dp[i][j] = 1 + fun(t1, t2, i + 1, j + 1, dp);

        } else {

            int c1 = fun(t1, t2, i + 1, j, dp);
            int c2 = fun(t1, t2, i, j + 1, dp);

            dp[i][j] = Math.max(c1, c2);
        }

        return dp[i][j];
    }

    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }

        return fun(text1, text2, 0, 0, dp);
    }
}