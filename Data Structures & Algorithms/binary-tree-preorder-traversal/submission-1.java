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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>out=new ArrayList<>();
        Stack<TreeNode>Stack=new Stack<>();
        if(root==null){
            return out;
        }
        Stack.add(root);
        while(!Stack.isEmpty()){
            TreeNode node=Stack.pop();
            out.add(node.val);
            if(node.right !=null){
                Stack.add(node.right);
            }
            if(node.left !=null){
                Stack.add(node.left);
            }
        }
        return out;
    }
}