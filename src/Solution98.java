
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return preorder(root);
    }
    private boolean preorder(TreeNode root){
        if(root == null){
            return true;
        }

        if(root.val>root.left.val && root.val<root.right.val){
            return preorder(root.left) && preorder(root.right);
        }
        return false;
    }
}
