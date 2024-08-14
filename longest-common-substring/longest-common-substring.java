class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
         int n1 = str1.length();
        int n2 = str2.length();
        int maxLength = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = i; j < n1; j++) {
                String subStr = str1.substring(i, j + 1);
                if (str2.contains(subStr)) {
                    maxLength = Math.max(maxLength, subStr.length());
                }
            }
        }
        return maxLength;
    }
}