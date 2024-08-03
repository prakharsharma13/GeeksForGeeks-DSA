public int celebrity(int mat[][]) {
        int index=-1;
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++) count+=mat[i][j];
            
            if(count>0) continue;

             for(int j=0;j<n;j++)  count+=mat[j][i];
              
             if(count==n-1)return i;
    
        }
        return -1;
    }