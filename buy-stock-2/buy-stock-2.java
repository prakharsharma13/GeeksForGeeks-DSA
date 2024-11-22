class Solution {
    public int maximumProfit(int prices[]) {
      int ans = 0;
      int min_Price = Integer.MAX_VALUE;
      for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_Price) {
                min_Price = prices[i];
            }
            int profit = prices[i] - min_Price;
            if (profit > ans) {
                ans = profit;
            }
        }
        return ans;
    }
}