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
public boolean isSameTree(TreeNode p, TreeNode q) {
if (p != null && q != null)
{
if (p.val != q.val)
return false;
boolean ans = isSameTree(p.left, q.left);
if (ans == false)
return false;
else
return isSameTree(p.right, q.right);
}
else
{
if (p != q) return false; 
else return true; 
}

}}