class Solution {
    // Function to find the majority elements in the array
   public List<Integer> findMajority(int[] nums) {
        
        int votes1=0,candidate1=-1;
        int votes2=0,candidate2=-1;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            if(candidate1==nums[i])
                votes1++;
            else if(candidate2==nums[i])
                votes2++;
            else if(votes1==0)
            {
                candidate1=nums[i];
                votes1=1;
            }
            else if(votes2==0)
            {
                candidate2=nums[i];
                votes2=1;
            }
            else
            {
                votes1--;
                votes2--;
            }
        }
        
        int count1=0,count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==candidate1)
                count1++;
            else if(nums[i]==candidate2)
                count2++;
        }
        
        ArrayList<Integer> res= new ArrayList<Integer>();
        
        if (count1 > n / 3) res.add(candidate1);
        if (count2 > n / 3) res.add(candidate2);
        if (res.size() == 2 && res.get(0) > res.get(1)) 
            Collections.swap(res, 0, 1);
        return res;
    }
}