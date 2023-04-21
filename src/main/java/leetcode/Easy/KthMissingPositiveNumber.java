package leetcode.Easy;

//https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int kthMissingInteger;
        int c = 0;
        int current = 1;

        for (int j : arr) {
            while (j != current) {
                kthMissingInteger = current;
                c++;
                current++;
                if (c == k) {
                    return kthMissingInteger;
                }
            }
            current++;
        }
        return arr[arr.length - 1] + k - c;
    }
}
