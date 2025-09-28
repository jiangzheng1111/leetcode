package edu.bupt.Extra;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    private Deque<Integer> stackPush;
    private Deque<Integer> stackPop;

    public MyQueue() {
        this.stackPush = new ArrayDeque<>();
        this.stackPop = new ArrayDeque<>();
    }

    public void push(int x) {
        stackPush.push(x);
    }

    public int pop() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public boolean empty() {
        return stackPop.isEmpty() && stackPush.isEmpty();
    }
}
