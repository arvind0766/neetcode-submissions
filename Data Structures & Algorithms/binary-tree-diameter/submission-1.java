/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int[] maxDepth = new int[1];
        int leftHeight = getHeight(root,maxDepth);
        return maxDepth[0];   
    }

    private int getHeight(TreeNode node, int[] maxDepth){
        if(node ==null) return 0;
        int leftMax= getHeight(node.left,maxDepth);
        int rightMax = getHeight(node.right,maxDepth);
        maxDepth[0] = Math.max(maxDepth[0],leftMax+rightMax);
        return 1 + Math.max(leftMax,rightMax);
    }
}
