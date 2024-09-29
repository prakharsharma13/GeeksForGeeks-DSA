class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            int q=arr[i]/k;
            int r=arr[i]%k;
            c+=r!=0?q+1:q;
        }
        return c;
    }
}

