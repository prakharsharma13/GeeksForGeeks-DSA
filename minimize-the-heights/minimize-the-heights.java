class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        if (n == 1) return 0; // If there's only one tower, no difference to minimize.

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Calculate the initial difference between the largest and smallest
        int maxDiff = arr[n - 1] - arr[0];

        // Step 3: Initial potential smallest and largest after modification
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        // Step 4: Iterate through the array to find the minimum possible difference
        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);

            if (minHeight < 0) continue; // Skip if the modified height becomes negative

            // Update the minimum difference
            maxDiff = Math.min(maxDiff, maxHeight - minHeight);
        }

        return maxDiff;
    }
}