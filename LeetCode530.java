package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode530 {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        middle(root,list);
        int result = Integer.MAX_VALUE;
        for (int i=1;i<list.size();i++) {
            result = Math.min(result,list.get(i)-list.get(i-1));
        }
        return result;
    }
    private void middle(TreeNode root, List<Integer> list) {
        if(root == null)
            return ;
        middle(root.left,list);
        list.add(root.val);
        middle(root.right,list);
    }
}
