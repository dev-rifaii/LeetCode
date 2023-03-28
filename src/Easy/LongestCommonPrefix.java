package Easy;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        int occurrences = 0;
        if (strs.length == 0) {
            return longestPrefix;
        }

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length - 1 && j != i; j++) {
                String currentLongest = "";
                int currentOccurrences = 0;
                for (int k = 0; k < Math.min(strs[i].length(), strs[j].length()); k++) {
                    if (strs[i].charAt(k) == strs[j].charAt(k)) {
                        currentLongest += strs[i].charAt(k);
                        currentOccurrences++;
                    } else {
                        break;
                    }
                }
                if (currentOccurrences > occurrences) {
                    longestPrefix = currentLongest;
                }
            }
        }
        return longestPrefix;
    }
}
