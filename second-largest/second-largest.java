class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
       int n=arr.length,sl=0;
        Arrays.sort(arr);
        for(int i=2;i<=n;i++)
        {
            if(arr[n-1]!=arr[n-i])
            {
                sl=arr[n-i];
                return sl;
            }
        }
        return -1;
    }
}