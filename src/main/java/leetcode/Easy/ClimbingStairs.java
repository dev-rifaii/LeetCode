package leetcode.Easy;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        if (n < 4) return n;
        int temp = 0;
        int beforeLast = 2;
        int last = 3;
        for (int i = 4; i < n; i++) {
            temp = beforeLast;
            beforeLast = last;
            last = temp + last;
        }
        return beforeLast + last;
    }

}
