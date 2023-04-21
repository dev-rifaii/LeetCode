package leetcode.Easy;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
