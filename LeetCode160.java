package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> middle = new HashSet<>();
        while(headA!=null) {
            middle.add(headA);
            headA = headA.next;
        }
        ListNode result = null;
        while (headB!=null) {
            if(middle.contains(headB)) {
                result = headB;
                break;
            }
            headB = headB.next;
        }
        return result;
    }
}