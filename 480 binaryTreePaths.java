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
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        String path = new String();
        List<String> res = new ArrayList<>();
        dfs(root, res, path);

        return res;
    }

    public void dfs(TreeNode root, List<String> res, String path)
    {
        if(root == null)
            return;

        if(root.left == null && root.right == null)
        {
            res.add(path + root.val + "");
            return;
        }
        dfs(root.left, res, path + root.val + "->");
        dfs(root.right, res, path + root.val + "->");
    }
}
