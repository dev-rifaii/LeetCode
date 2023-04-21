package leetcode.Easy;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean foundPair = false;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[i] == nums[j]) {
                    foundPair = true;
                    break;
                }

            }
            if (!foundPair) {
                return nums[i];
            }
        }
        return 0;
    }
}
