package leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

//Link: https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        byte[] stemp = s.getBytes();
        byte[] ttemp = t.getBytes();

        Map<Byte, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            occurrences.merge(stemp[i], 1, Integer::sum);
            occurrences.merge(ttemp[i], -1, Integer::sum);
            {
                if (occurrences.get(stemp[i]) == 0) {
                    occurrences.remove(stemp[i]);
                }
                if (occurrences.get(ttemp[i])!= null && occurrences.get(ttemp[i]) == 0) {
                    occurrences.remove(ttemp[i]);
                }
            }
        }

        return occurrences.isEmpty();
    }
}
