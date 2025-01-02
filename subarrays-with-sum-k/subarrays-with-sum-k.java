class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        
        int presum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            presum += arr[i];
            if(map.containsKey(presum-k)){
                ans += map.get(presum-k);
            }
            if(presum == k){
                ans += 1;
            }
            if(map.containsKey(presum)){
                map.put(presum, map.get(presum)+1);
            }
            else{
                map.put(presum,1);
            }
        }
        return ans;
    }
}