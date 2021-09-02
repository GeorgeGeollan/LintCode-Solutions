/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        helper(root);
    }

    public void helper(TreeNode root)
    {
        if(root == null)
            return;

        TreeNode temp = new TreeNode(0);

        temp = root.right;
        root.right = root.left;
        root.left = temp;

        helper(root.left);
        helper(root.right);
    }
}
