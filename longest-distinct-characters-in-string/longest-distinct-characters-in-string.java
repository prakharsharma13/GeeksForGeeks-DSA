class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int map=0;
        int i=0;
        int j=0;
        int ans=0;
        int n=s.length();
        while(j<n){
            char c=s.charAt(j);
            if((map&(1<<c-'a'))!=0){
                while(s.charAt(i)!=c){
                    char t=s.charAt(i);
                    i++;
                    map=map&(~(1<<t-'a'));
                }
                map=map&(~(1<<c-'a'));
                i++;
            }
             
            map=(map|(1<<c-'a')); 
            ans=Math.max(ans,(j-i+1));
            j++;
            
        }
        return ans;
    }
   
}