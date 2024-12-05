class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int i=0,j=arr.length-1,in=0;
        while(i<=j){
            if(arr[i]==0){
                int t=arr[in];
                arr[in]=0;
                arr[i]=t;
                i++;
                in++;
                
            }
            else if(arr[i]==2){
                int t=arr[j];
                arr[j]=2;
                arr[i]=t;
            
                j--;
            }
            else
                i++;
        }
        return;
    }
}