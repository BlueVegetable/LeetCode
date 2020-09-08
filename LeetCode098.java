package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 */
public class LeetCode098 {
    List<Integer> value;
    public boolean isValidBST(TreeNode root) {
        value = new ArrayList<>();
        zhongXuBianLi(root);
        for (int i=0;i<value.size()-1;i++) {
            if(value.get(i) >= value.get(i+1))
                return false;
        }
        return true;
    }
    private void zhongXuBianLi(TreeNode treeNode) {
        if(treeNode == null)
            return ;
        zhongXuBianLi(treeNode.left);
        value.add(treeNode.val);
        zhongXuBianLi(treeNode.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}