package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        else if(lists.length ==1) {
            return lists[0];
        } else if(lists.length == 2) {
            return mergeTwoList(lists[0],lists[1]);
        } else {
            int number = lists.length%2;
            ListNode[] current1 = new ListNode[number];
            ListNode[] current2 = new ListNode[lists.length-number];
            for (int i=0;i<current1.length;i++) current1[i] = lists[i];
            for (int i=0;i<current2.length;i++) current2[i] = lists[number+i];
            return mergeTwoList(mergeKLists(current1),mergeKLists(current2));
        }
    }
    private ListNode mergeTwoList(ListNode left,ListNode right) {
        if(left == null)
            return right;
        if(right == null)
            return left;
        ListNode result = new ListNode(-1);
        ListNode point = result;
        while(left!=null&&right!=null) {
            if(left.val<right.val) {
                ListNode current = new ListNode(left.val);
                point.next = current;
                point = current;
                left = left.next;
            } else {
                ListNode current = new ListNode(right.val);
                point.next = current;
                point = current;
                right = right.next;
            }
        }
        while(left!=null) {
            ListNode current = new ListNode(left.val);
            point.next = current;
            point = current;
            left = left.next;
        }
        while(right!=null) {
            ListNode current = new ListNode(right.val);
            point.next = current;
            point = current;
            right = right.next;
        }
        result = result.next;
        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = null;
        ListNode list2 = new ListNode(-1);
        ListNode list3 = null;
        ListNode list4 = new ListNode(6);

//        list1.next = new ListNode(4);
//        list1.next.next = new ListNode(5);

        list2.next = new ListNode(5);
        list2.next.next = new ListNode(11);

//        list3.next = new ListNode(6);

        list4.next = new ListNode(10);

        LeetCode023 leetCode023 = new LeetCode023();

        ListNode[] lists = new ListNode[]{list1,list2,list3,list4};
        leetCode023.scan(leetCode023.mergeKLists(lists));
    }
    private void scan(ListNode listNode) {
        ListNode point = listNode;
        List<Integer> value = new ArrayList<>();
        while(point!=null) {
            value.add(point.val);
            point = point.next;
        }
        System.out.println(value);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}