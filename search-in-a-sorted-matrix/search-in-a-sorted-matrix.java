class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code hereat[0];
        int startrow=0;
        int endrow=mat.length-1;
        
        
        while(startrow<=endrow)
        {
            int startcol=0;
            int endcol=mat[0].length-1;
            if(mat[startrow][startcol]<=x  && mat[startrow][endcol]>=x)
            {
               while(startcol<=endcol)
               {
                   int mid=(startcol+endcol)/2;
                   
                   if(mat[startrow][mid]==x)
                   {
                       return true;
                   }
                   else if(mat[startrow][mid]<x)
                   {
                       startcol=mid+1;
                   }
                   else
                   {
                       endcol=mid-1;
                   }
               }
               
            }
            startrow++;
        }
        return false;
    }
}