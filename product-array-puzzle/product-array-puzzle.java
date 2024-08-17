class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long[] arr = new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=helper(i,nums);
        }
        return arr;
    }
    
    public static long helper(int k,int[] nums)
    {
        long prod=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==k)
             continue;
            
            prod*=(long)nums[i];
             
        }
        return prod;
    }
    
}