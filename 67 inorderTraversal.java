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
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList<>();

        helper(root, list);

        return list;
    }

    public void helper(TreeNode root, List<Integer> list)
    {
        if(root == null)
            return;

        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
