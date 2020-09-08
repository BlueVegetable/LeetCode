package leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 找树左下角的值
 * 给定一个二叉树，在树的最后一行找到最左边的值
 */
public class LeetCode513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode current = null;
        while(!queue.isEmpty()) {
            current = queue.poll();
            if(current.right!=null)
                queue.offer(current.right);
            if(current.left!=null)
                queue.offer(current.left);
        }
        return current.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode point1 = new TreeNode(2);
        TreeNode point2 = new TreeNode(3);
        TreeNode point3 = new TreeNode(4);
        TreeNode point4 = new TreeNode(5);
        TreeNode point5 = new TreeNode(6);
        TreeNode point6 = new TreeNode(7);
        root.left = point1;
        root.right = point2;
        point1.left = point3;
        point2.left = point4;
        point2.right = point5;
        point4.left = point6;
        System.out.println(new LeetCode513().findBottomLeftValue(root));
    }
}
