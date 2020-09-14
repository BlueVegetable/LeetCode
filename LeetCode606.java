package leetCode;

public class LeetCode606 {
    public String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }
        return solution(t);
    }
    private String solution(TreeNode root) {
        String result = "";
        if(root != null) {
            result = result + root.val;
            if(root.left!=null||root.right!=null)
                result = result + "(" + solution(root.left) + ")";
            if(root.right!=null) {
                result = result + "(" + solution(root.right) + ")";
            }
        } else {
            return "";
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        System.out.println(new LeetCode606().tree2str(treeNode1));
    }
}