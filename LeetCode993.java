package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode993 {
    private Map<Integer,TreeNode> parent;
    private Map<Integer,Integer> depth;
    public boolean isCousins(TreeNode root, int x, int y) {
        parent = new HashMap<>();
        depth = new HashMap<>();
        parent.put(dp(root,0),null);
        if(parent.get(x) == null&&parent.get(y)!=null&&depth.get(x) == depth.get(y)||
                parent.get(y) == null&&parent.get(x)!=null&&depth.get(x) == depth.get(y))
            return true;
        if(!parent.get(x).equals(parent.get(y))&&depth.get(x) == depth.get(y))
            return true;
        else
            return false;
    }
    private int dp(TreeNode root,int deep) {
        if(root.left == null && root.right == null) {
            depth.put(root.val,deep);
            return root.val;
        }
        if(root.left != null)
            parent.put(dp(root.left,deep+1),root);
        if(root.right != null)
            parent.put(dp(root.right,deep+1),root);
        depth.put(root.val,deep);
        return root.val;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(new LeetCode993().isCousins(treeNode1,4,5));
    }
}