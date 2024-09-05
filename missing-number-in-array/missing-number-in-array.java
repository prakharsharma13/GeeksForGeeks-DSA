class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sum=0,expectedSum=n;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
            expectedSum+=i+1;
        }
        return expectedSum-sum;
    }
}