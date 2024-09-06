class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        // Your code here
        long sum=0,ans=Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            ans=Math.max(ans,sum);
            if(sum<0) sum=0;
        }
        return ans;
    }
}