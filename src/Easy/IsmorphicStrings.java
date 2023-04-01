package Easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/
public class IsmorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))) {
                    return false;
                }

                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
