class Solution {
    public boolean checkSorted(List<Integer> arr) {
        int count = 0;
        int n = arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i) != i+1) count++;
        }
        if(count == 1 || count == 2 || count > 4) return false;
        if(count == 0 || count == 3) return true;
        for(int i=0;i<n;i++){
            if(arr.get(i) != i+1){
                if(arr.get(arr.get(i)-1) == i+1){
                    return true;
                }
            }
        }
        return false;
    }
}