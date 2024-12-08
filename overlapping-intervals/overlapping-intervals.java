class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        
        int[] currentInterval = arr[0];
        ans.add(currentInterval);
        
        for (int i = 1; i < arr.length; i++) {
            int[] interval = arr[i];
            int currentEnd = currentInterval[1];
            if (interval[0] <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, interval[1]);
            } else {
                currentInterval = interval;
                ans.add(currentInterval);
            }
        }
        
        return ans;
    }
}