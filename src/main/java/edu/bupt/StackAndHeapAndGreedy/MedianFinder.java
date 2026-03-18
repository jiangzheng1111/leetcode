package edu.bupt.StackAndHeapAndGreedy;

import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> left = new PriorityQueue<>((x, y) -> (x - y));
    private PriorityQueue<Integer> right = new PriorityQueue<>((x, y) -> (y - x));

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (left.size() == right.size()) {
            right.offer(num);
            left.offer(right.poll());
        } else {
            left.offer(num);
            right.offer(left.poll());
        }
    }

    public double findMedian() {
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek() * 1.0;
        }
    }
}
