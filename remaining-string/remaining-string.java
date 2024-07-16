class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        String str = "";
        for(int i=0;i<s.length();i++){
            char chr = s.charAt(i);
            if(count<=0){
                str = str+chr;
            }
            if(chr == ch){
                count--;
            }
        }
        return str;
    }
}