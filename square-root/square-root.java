class Solution {
    long floorSqrt(long n) {
        long  low=1;
        long high=n;
        long ans=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(mid*mid==n)
                return mid;
            else if(mid*mid<n)
              {  ans=mid;
                low=mid+1;}
            else 
             {   high=mid-1;}
        }
        return (int )ans;
    }
}