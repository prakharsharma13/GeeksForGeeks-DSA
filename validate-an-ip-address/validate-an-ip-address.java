class Solution {

    public boolean isValid(String str) {
        String ans = "";
        int segments = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Collect characters that are not dots
            if (ch != '.') {
                ans += ch;
            }

            // Process the segment when a dot is encountered or at the end of the string
            if (ch == '.' || i == str.length() - 1) {
                // Edge case: Trailing dot
                if (i == str.length() - 1 && ch == '.') {
                    return false;
                }

                // Empty segment or non-numeric segment
                if (ans.isEmpty() || !ans.matches("\\d+")) {
                    return false;
                }

                int num = Integer.valueOf(ans);

                // Number outside valid range or leading zero in multi-digit number
                if (num < 0 || num > 255 || (ans.length() > 1 && ans.charAt(0) == '0')) {
                    return false;
                }

                // Reset for next segment
                ans = "";
                segments++;
            }
        }

        // Ensure exactly 4 segments
        return segments == 4;
    }
}