package edu.bupt.ListNode;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode n0 = dummy;
        ListNode n1 = head;
        while (n1 != null && n1.next != null) {
            ListNode n2 = n1.next;
            ListNode n3 = n2.next;

            n0.next = n2;
            n2.next = n1;
            n1.next = n3;

            n0 = n1;
            n1 = n3;
        }
        return dummy.next;
    }
}
