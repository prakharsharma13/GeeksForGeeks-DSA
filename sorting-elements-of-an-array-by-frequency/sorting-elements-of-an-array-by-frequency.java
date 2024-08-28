class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        ArrayList<Integer> al=new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
            al.add(i);
        }
        Collections.sort(al,(x,y)->hm.get(x)==hm.get(y)?x-y:hm.get(y)-hm.get(x));
        return al;
    }
}