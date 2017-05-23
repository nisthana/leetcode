/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LeetcodeEasyInvertTree {
    public TreeNode invertTree(TreeNode root) {
        return invertIt(root);
    }
    
      TreeNode invertIt(TreeNode root) {
        if (root == null) return null;
        TreeNode leftChild = invertIt(root.left);
        TreeNode rightChild = invertIt(root.right);
        TreeNode temp = leftChild;
        root.left = rightChild;
        root.right = temp;
        return root;
    }
}