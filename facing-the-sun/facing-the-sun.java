class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int c=0, hmax=Integer.MIN_VALUE;
        for(int i=0; i<height.length; i++){
            if(height[i]>hmax) c++;
            hmax=Math.max(hmax,height[i]);
        }
        return c;
    }
}