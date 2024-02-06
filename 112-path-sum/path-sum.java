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
    public static void order(TreeNode root, int target, ArrayList<Boolean> ans){
        if(root==null){
            return;
        }
        if(root.left == null && root.right == null && target-root.val == 0){
            ans.add(true);
            return;
        }
        order(root.left, target-root.val , ans);
        order(root.right, target-root.val, ans);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayList<Boolean> ans = new ArrayList<>();
        order(root, targetSum, ans);
        if(ans.size()==0){
            return false;
        }
        return true;
    }
}