class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long  sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+1<arr[i])return sum+1;
            sum+=arr[i];
        }
        return sum+1;
    }
}