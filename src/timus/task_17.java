package timus;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class task_17 {
    ArrayList<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root){

        if(root == null ){
            return;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
}
