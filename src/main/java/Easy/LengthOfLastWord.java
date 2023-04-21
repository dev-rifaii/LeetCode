package Easy;

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int c = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            } else {
                c++;
            }
            if (c > 0 && (i - 1 == -1 || s.charAt(i - 1) == ' ')) {
                return c;
            }
        }

        return c;
    }
}