package leetcode.Easy;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n))
                return true;
        }

        return false;
    }
}
