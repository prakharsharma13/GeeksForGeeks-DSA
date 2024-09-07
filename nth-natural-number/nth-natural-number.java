class Solution {
    long findNth(long n) {
        // code here
        int i=1;
        long l=n%9;
        n=n/9;
        while(n>0){
                l=((n%9)*(long)Math.pow(10,i))+l;
            n=n/9;
            i++;
        }
        return l;
    }
}