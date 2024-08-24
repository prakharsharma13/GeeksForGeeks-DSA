class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int N = val.length;
        int[][] dp = new int[N + 1][W + 1];

        // Build the dp array
        for (int i = 1; i <= N; i++) {
            for (int w = 0; w <= W; w++) {
                // If weight of the current item is less than or equal to the current capacity
                if (wt[i - 1] <= w) {
                    // Choose the maximum of including the item or not including it
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - wt[i - 1]] + val[i - 1]);
                } else {
                    // If the item cannot be included, carry forward the value without it
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The maximum value that can be put in the knapsack of capacity W
        return dp[N][W];
    }
}