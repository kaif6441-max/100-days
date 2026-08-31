class Solution {
    static int dp[][];

    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }
        int ans = count(amount, coins, 0);
        if (ans >= 1000000) return -1;
        return ans;
    }
    public int count(int amt, int coins[], int i) {
        if (amt == 0)
            return 0;
        if (i >= coins.length || amt < 0)
            return 1000000;
        if (dp[i][amt] != -1)
            return dp[i][amt];
        int take = 1000000;
        if (coins[i] <= amt) {
            take = 1 + count(amt - coins[i], coins, i);
        }
        int skip = count(amt, coins, i + 1);
        return dp[i][amt] = Math.min(take, skip);
    }
}