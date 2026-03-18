package edu.bupt.ListNode;

public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = count(head);
        ListNode dummy = new ListNode(-1, head);
        ListNode n0 = dummy;
        ListNode cur = head;
        ListNode pre = null;
        while (n >= k) {
            n -= k;
            for (int i = 0; i < k; i++) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            ListNode next = n0.next;
            n0.next.next = cur;
            n0.next = pre;
            n0 = next;
        }
        return dummy.next;
    }

    private int count(ListNode head) {
        ListNode cur = head;
        int cnt = 0;
        while (cur != null) {
            cur = cur.next;
            cnt++;
        }
        return cnt;
    }
}
