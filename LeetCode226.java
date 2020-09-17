package leetCode;

public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        solution(root);
        return root;
    }

    private void solution(TreeNode curRoot) {
        if (curRoot == null) {
            return;
        }

        TreeNode leftNode = curRoot.left;
        TreeNode rightNode = curRoot.right;
        if (leftNode != null || rightNode != null) {
            TreeNode tmpNode = leftNode;
            curRoot.left = curRoot.right;
            curRoot.right = leftNode;
            solution(leftNode);
            solution(rightNode);
        }
    }
}