package leetcode.Easy;

import java.util.Map;

//Link: https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    Map<Character, Integer> legend = Map.ofEntries(
            Map.entry('I', 1),
            Map.entry('V', 5),
            Map.entry('X', 10),
            Map.entry('L', 50),
            Map.entry('C', 100),
            Map.entry('D', 500),
            Map.entry('M', 1000)
    );

    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int iValue = legend.get(s.charAt(i));
            int i1Value = i + 1 < s.length() ? legend.get(s.charAt(i + 1)) : 0;
            if (iValue < i1Value) {
                sum += i1Value - iValue;
                i++;
            } else {
                sum += iValue;
            }
        }
        return sum;
    }
}
