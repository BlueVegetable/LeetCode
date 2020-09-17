package leetCode;

public class LeetCode617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode left,right,current = new TreeNode(0);
        if(t1!=null&&t2!=null) {
            left = mergeTrees(t1.left,t2.left);
            right = mergeTrees(t1.right,t2.right);
            current.val = t1.val + t2.val;
        } else if(t1!=null && t2 == null) {
            left = mergeTrees(t1.left,null);
            right = mergeTrees(t1.right,null);
            current.val = t1.val;
        } else  if(t1 == null && t2!=null) {
            left = mergeTrees(null,t2.left);
            right = mergeTrees(null,t2.right);
            current.val = t2.val;
        } else {
            return null;
        }
        current.left = left;
        current.right = right;
        return current;
    }
}