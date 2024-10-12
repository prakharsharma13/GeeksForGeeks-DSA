class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        if(arr.length==1)
        return -1;
        int max=0;
        for(int i=1;i<arr.length;i++)
        max=Math.max(max,arr[i-1]+arr[i]);
        return max;
    }
}