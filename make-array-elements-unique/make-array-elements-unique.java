class Solution {
    public int minIncrements(int[] arr) {
        int ans=0;
        Arrays.sort(arr);
        int mini = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] <= mini)
            {
                ans += mini + 1 - arr[i];
                mini = mini + 1;
            }
            else{
                mini = arr[i];
            }
            
        }
        return ans;
    }
}