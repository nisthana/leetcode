/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LeetcodeEasyMaxDepthOfBinaryTree {
    int depth=0;
    public int maxDepth(TreeNode root) {
        int maxDepth = depth(root);
        return maxDepth;
    }
     int depth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        if (leftDepth >= rightDepth) return leftDepth+1; else return rightDepth+1;
    }
}