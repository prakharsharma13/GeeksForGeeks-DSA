class Solution {
    public int alternatingMaxLength(int[] arr) {
        // code here
          int n = arr.length;
        if (n == 1) return 1;

        int inc = 1, dec = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) inc = dec + 1;
            else if (arr[i] < arr[i - 1]) dec = inc + 1;
        }
        return Math.max(inc, dec);
    }
}