class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;
        
        for(int i:arr){
            if(i>largest){
                secLargest=largest;
                largest=i;
            }
            if(i>secLargest && i<largest){
                secLargest=i;
            }
        }
        return largest+secLargest;
        
        /* 
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1]+arr[n-2];
        */
    }
}