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
    List<String> pathList = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        traversal(root, "");
        return pathList;
        
    }
    private void traversal(TreeNode node, String path){
        if(node==null)return;
        if(node.left==null && node.right==null){
            path+=node.val;
            pathList.add(path);
        }else{
            path+=node.val+"->";
            traversal(node.left, path);
            traversal(node.right, path);
        }
    }
}