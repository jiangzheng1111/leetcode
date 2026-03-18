package edu.bupt.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private static class Node {
        int key;
        int value;
        Node pre;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Node dummy = new Node(0, 0);
    private final Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dummy.pre = dummy;
        dummy.next = dummy;
    }

    public int get(int key) {
        Node node = getNode(key);
        return node == null ? -1 : node.value;
    }

    public void put(int key, int value) {
        Node node = getNode(key);
        if (node != null) {
            node.value = value;
            return;
        }
        node = new Node(key, value);
        putFront(node);
        map.put(key, node);
        if (map.size() > capacity) {
            Node last = dummy.pre;
            map.remove(last.key);
            remove(last);
        }
    }

    private Node getNode(int key) {
        if (!map.containsKey(key)) {
            return null;
        }
        Node node = map.get(key);
        remove(node);
        putFront(node);
        return node;
    }

    private void putFront(Node x) {
        x.pre = dummy;
        x.next = dummy.next;
        x.pre.next = x;
        x.next.pre = x;
    }

    private void remove(Node x) {
        x.pre.next = x.next;
        x.next.pre = x.pre;
    }
}
