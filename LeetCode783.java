package leetCode;

public class LeetCode783 {
    int result = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int minDiffInBST(TreeNode root) {
        solution(root);
        return result;
    }
    public void solution(TreeNode root) {
        if(root == null)
            return ;
        solution(root.left);
        if(pre != null) {
            result = Math.min(result,root.val-pre.val);
        }
        pre = root;
        solution(root.right);
    }
}