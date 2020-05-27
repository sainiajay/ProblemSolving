package io.problems.coin_change;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change
 * 
 */
public class DPSolution {
    public static int solve(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for(int j = 0; j < coins.length; ++j) {
            for(int i = 1; i <= amount; ++i) {
                if(i - coins[j] >= 0) {
                    if(dp[i - coins[j]] >= 0 && dp[i] >= 0) {
                        dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                    }
                    else if(dp[i - coins[j]] >= 0) {
                        dp[i] = dp[i - coins[j]] + 1;
                    }
                }
            }
        }
        return dp[amount];
    }
}