package Easy;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String currentLongest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < currentLongest.length()) {
                currentLongest = currentLongest.substring(0, strs[i].length());
            }
            for (int j = 0; j < currentLongest.length(); j++)
                if (currentLongest.charAt(j) != strs[i].charAt(j)) {
                    currentLongest = currentLongest.substring(0, j);
                }
        }

        return currentLongest;
    }
}
