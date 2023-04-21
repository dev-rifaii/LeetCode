package leetcode.Easy;

//https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }
            }
        }

        return Math.max(Math.abs(nums[0]) * Math.abs(nums[1]) * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
