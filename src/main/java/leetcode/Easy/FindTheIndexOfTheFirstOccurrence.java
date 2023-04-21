package leetcode.Easy;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindTheIndexOfTheFirstOccurrence {

    public int strStr(String haystack, String needle) {
        boolean potential = false;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                potential = true;
            }
            if (potential) {
                for (int j = 0; j < needle.length(); j++) {
                    if (i + j > haystack.length() - 1) return -1;
                    if (needle.charAt(j) == haystack.charAt(i + j)) {
                        if (j == needle.length() - 1) return i;
                    } else {
                        potential = false;
                        break;
                    }
                }
            }
        }
        return -1;
    }
}
