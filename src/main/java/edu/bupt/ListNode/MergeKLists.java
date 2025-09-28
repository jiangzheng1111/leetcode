package edu.bupt.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.val));
        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            if (node.next != null) {
                pq.offer(node.next);
            }
            cur.next = node;
            cur = cur.next;
        }
        return dummy.next;
    }
}
