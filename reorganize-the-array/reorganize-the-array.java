import java.util.*;
class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        HashSet<Integer> set=new HashSet<Integer>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            set.add(arr.get(i));
        }
        for(int i=0;i<arr.size();i++){
            if(set.contains(i)){
                list.add(i);
                
            }
            else{
                list.add(-1);
            }
        }return list;
        // Code here
    }
}