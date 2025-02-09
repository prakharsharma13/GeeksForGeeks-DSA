class Solution {
	   boolean isValid(int r, int c, int[][] chess) {
		   for(int i=0;i<chess.length;i++) 
			   if(chess[i][c]==1)return false;
		   
		   
		   for(int j=0;j<chess.length;j++) 
			   if(chess[r][j]==1)return false;
		   
		   
		   int i=r;
		   int j=c;
		   while(i<chess.length && j< chess.length) {
			   if(chess[i][j]==1)return false;
			   i++;
			   j++;
		   }
 
		    i=r;
		    j=c;
		   while(i>=0 && j>=0) {
			   if(chess[i][j]==1)return false;
			   i--;
			   j--;
		   }
		   
		    i=r;
		    j=c;
		   while(i<chess.length && j>=0) {
			   if(chess[i][j]==1)return false;
			   i++;
			   j--;
		   }
		   
		    i=r;
		    j=c;
		   while(i>=0 && j<chess.length) {
			   if(chess[i][j]==1)return false;
			   i--;
			   j++;
		   }
			return true;
		}

 void f(int c,int n,int chess[][],ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans) {
		if(c==n) {		
			ans.add(new ArrayList<>(temp));
			return;
		}
		for(int i=0;i<n;i++) {		
			if(isValid(i,c,chess)) {
				chess[i][c]=1;
				temp.add(i+1);
				f(c+1,n,chess,temp,ans);
				int ind=temp.indexOf(i+1);
				temp.remove(ind);
				chess[i][c]=0;
			}
		}
	}

	public  ArrayList<ArrayList<Integer>> nQueen(int n) {
	    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
	    int chess[][]=new int[n][n];
	    ArrayList<Integer> temp=new ArrayList<>();
	     f(0,n,chess,temp,ans);	    
	     return ans;
    }
}