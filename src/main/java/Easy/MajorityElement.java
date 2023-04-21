package Easy;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int current = nums[0];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == current) c++;
            else {
                current = nums[i];
                c = 1;
            }
            if (c >= (double) nums.length / 2) return current;
        }
        return current;
    }
}
