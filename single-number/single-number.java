class Solution {
    int getSingle(int arr[]) {
   
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (countMap.get(num) % 2 != 0) {
                return num;
            }
        }

        return -1;
    }
}