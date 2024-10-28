class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int n:arr){
            if(! ans.contains(n)) ans.add(n);
        }
        return ans;
    }
}