class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        ArrayList<Integer> List = new ArrayList<>();
        HashSet<Integer> aList = new HashSet<>();
        HashSet<Integer> bList = new HashSet<>();
        
        for(int num : a){
            aList.add(num);
        }
        for(int num : b){
            bList.add(num);
        }
        for(int val : aList){
            if(bList.contains(val)){
                List.add(val);
            }
        }
        return List;
    }
}