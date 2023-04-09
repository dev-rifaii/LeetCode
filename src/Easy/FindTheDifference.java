package Easy;

//https://leetcode.com/problems/find-the-difference/
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            int tOccurrences = 0;
            char currentChar = t.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == currentChar) tOccurrences++;
            }
            int sOccurrences = 0;
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == currentChar) sOccurrences++;
            }
            if (tOccurrences != sOccurrences) return currentChar;
        }

        return '?';
    }
}
