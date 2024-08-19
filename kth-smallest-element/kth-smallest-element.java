class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int max=Arrays.stream(arr).max().getAsInt();
        int a[]=new int[max+1];
        for(int i:arr) a[i]++;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                k--;
                if(k==0) return i;
            }
        }
        return -1;
    }
}