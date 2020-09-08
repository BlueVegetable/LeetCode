package leetCode;

public class LeetCode061 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        int len = 0;
        while(cur.next != null) {
            cur = cur.next;
            len++;
        }
        while(k >= len) {
            k -= len;
        }
        if(k == 0) {
            return head;
        }
        ListNode cur1 = dummyHead;
        ListNode cur2 = dummyHead;
        for(int i = 0; i < k; i++) {
            cur1 = cur1.next;
        }
        while(cur1.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        cur1.next = dummyHead.next;
        dummyHead.next = cur2.next;
        cur2.next = null;
        return dummyHead.next;
    }
}
