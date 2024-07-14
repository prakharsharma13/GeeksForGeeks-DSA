class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int low = 0;
        int high = arr.length-1;
        for(int i =0;i<arr.length && i<=high;i++){
            if(arr[i]==0){
                int temp = arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
                low++;
            }
        }
    }
}