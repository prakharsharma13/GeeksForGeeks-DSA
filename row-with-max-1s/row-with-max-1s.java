class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int ans=-1;
         int max=0;
        for(int r=0;r<arr.length;r++)
        {
            int count=0;
            for(int c=0;c<arr[r].length;c++)
            {
                if(arr[r][c]==1)
                  count++;
            }
            if(count>max)
            {
              max=count;
              ans=r;
            }
        }
        if(max==0)
            return -1;
        
        return ans;
    }
}