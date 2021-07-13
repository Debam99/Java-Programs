class Solution {
  private boolean checkPathSum(TreeNode node, int sum, int target){
        if(node==null)
            return false;
        if(node.left==null && node.right==null && target == sum + node.val){
            return true;
        }
        if(node.left!=null && checkPathSum(node.left, sum + node.val, target))
            return true;
        if(node.right!=null && checkPathSum(node.right, sum + node.val, target))
            return true;
        
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return checkPathSum(root, 0, targetSum);
    }
}
