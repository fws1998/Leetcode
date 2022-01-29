public class Solution236 {

    private TreeNode ans;
    public TreeNode last(TreeNode root, TreeNode p, TreeNode q){
        dfs(root, p, q);
        return ans;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return false;
        }

        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);

        if ((left&&right)||((root.val==p.val)||root.val==q.val)&&(left||right)){
            ans=root;
        }
        return left||right || (root.val==p.val || root.val==p.val);
    }

}
