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
// class Solution {
//     boolean isSame(TreeNode a,TreeNode b){
//         if(a==null && b==null)
//             return true;
//         if(a==null || b==null)
//             return false;
//         if(a.val!=b.val)
//             return false;
//         return isSame(a.left,b.left) && isSame(a.right,b.right);
//     }
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if(root == null)
//             return subRoot==null;
//         if(isSame(root,subRoot))
//             return true;
//         return isSame(root.left,subRoot) || isSame(root.right,subRoot);
        
//     }
// }
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return subRoot == null;
        if (isSameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}