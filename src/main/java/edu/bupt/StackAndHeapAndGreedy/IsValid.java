package edu.bupt.StackAndHeapAndGreedy;

import java.util.ArrayDeque;
import java.util.Deque;

public class IsValid {

    public boolean isValid(String s) {
        char[] sc = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : sc) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
