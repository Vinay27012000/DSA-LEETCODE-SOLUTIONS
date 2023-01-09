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
     private List <Integer> list =new ArrayList<>();
    private void pre(TreeNode troot){
        if(troot==null)
            return;
       list.add(troot.val);
        pre(troot.left);
        pre(troot.right);
        
    } 
    public List<Integer> preorderTraversal(TreeNode root) {
        
       
          pre(root);
         return list;  
        
    }
}