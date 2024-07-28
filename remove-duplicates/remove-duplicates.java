class Solution {
    String removeDups(String str) {
        // code here
        String  result = "";
           for(int i = 0 ; i < str.length(); i++) {
               char ch = str.charAt(i);
               if(result.indexOf(ch) == -1){
                   result += ch;
               }
           }
           return result;
    }
}

