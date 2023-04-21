package leetcode.Easy;


//Link: https://leetcode.com/problems/add-digits/
public class AddDigits {

    public static int addDigits(int num) {
        int out = num;
        while (out > 9) {
            out = add(out);
        }
        return out;
    }

    private static int add(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }
}
