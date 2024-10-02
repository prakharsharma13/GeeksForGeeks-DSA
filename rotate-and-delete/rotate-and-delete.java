class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int k=1;
        while(arr.size()>1){
            //rotate
            arr.add(0,arr.get(arr.size()-1));
            arr.remove(arr.size()-1);
            //remove kth element
            arr.remove(arr.size()-k);
            k++;
            
            if(k>arr.size()){
                break;
            }
        }
        return arr.get(0);
    }
}