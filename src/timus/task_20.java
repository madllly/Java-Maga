package timus;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class task_20 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max( maxDepth(root.left) , maxDepth( root.right )  ) + 1;
    }
}
