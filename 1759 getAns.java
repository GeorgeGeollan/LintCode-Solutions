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
     * @param root: the root of the binary tree
     * @return: the number of nodes
     */
     int count;
    public int getAns(TreeNode root) {
        // Write your code here
        count = 0;

        helper(root);

        return count;
    }

    public void helper(TreeNode root)
    {
        if(root == null)
            return;

        count++;
        helper(root.left);
        helper(root.right);
    }
}
