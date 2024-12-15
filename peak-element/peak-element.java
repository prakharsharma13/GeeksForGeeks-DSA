class Solution {

    public int peakElement(int[] arr) {
        // code here
        int l=0;int r=arr.length-1;
        
        if(arr.length==1){
            return 0;
        }
        if(arr[0]>=arr[1]) return 0;
        if(arr[arr.length-1]>=arr[arr.length-2])return arr.length-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid+1]){
                r =mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}