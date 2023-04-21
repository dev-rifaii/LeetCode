package Easy;

import java.util.Stack;

//Link: https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(', '[', '{' -> stack.push(s.charAt(i));
                case ')' -> {
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else return false;
                }
                case ']' -> {
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else return false;
                }
                case '}' -> {
                    if (!stack.isEmpty() && stack.peek().equals('{')) stack.pop();
                    else return false;
                }
                default -> {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
