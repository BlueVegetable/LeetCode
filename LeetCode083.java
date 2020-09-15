package leetCode;

import java.util.List;

public class LeetCode083 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode previous = head,current = head.next;
        while(current!=null) {
            if(current.val == previous.val) {
                previous.next = current.next;
                current = current.next;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode head = new LeetCode083().deleteDuplicates(listNode1);
        System.out.println(head);
    }
}