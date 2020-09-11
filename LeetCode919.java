package leetCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode919 {
    
    private TreeNode root;
    private Deque<TreeNode> deque;
    
    public LeetCode919(TreeNode root) {
        this.root = root;
        deque = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.left == null||node.right == null)
                deque.offerLast(node);
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right!=null)
                queue.offer(node.right);
        }
    }

    public int insert(int v) {
        TreeNode node = new TreeNode(v);
        TreeNode first = deque.peekFirst();
        if(first.left == null) {
            first.left = node;
        } else {
            first.right = node;
            deque.pollFirst();
        }
        deque.offerLast(node);
        return first.val;
    }

    public TreeNode get_root() {
        return root;
    }
}