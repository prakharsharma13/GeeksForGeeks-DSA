class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       
       int[] dp = new int[n+1];
       Arrays.fill(dp, -1);
       int res = cuts(n, x, y, z, dp);
       
       return res<0?0:res;
    }
    
    public int cuts(int n, int x, int y, int z, int[] dp)
    {
       if(n==0) return 0;
       if(n<0) return Integer.MIN_VALUE;
       if(dp[n]!=-1) return dp[n];
       
       int max = 1+Math.max(cuts(n-x, x, y, z, dp), Math.max(cuts(n-y, x, y, z, dp),cuts(n-z, x, y, z, dp)));
    
       return dp[n]=max;
    }
    
}