import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if (root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean isLeft = true;

        while (!queue.isEmpty()){
            Deque<Integer> level = new LinkedList<Integer>();
            int size = queue.size();

            for (int i=0; i<size; i++){
                TreeNode curNode = queue.poll();
                if (isLeft){
                    level.offerLast(curNode.val);
                }else {
                    level.offerFirst(curNode.val);
                }

                if (curNode.left!=null){
                    queue.offer(curNode.left);
                }
                if (curNode.right!=null){
                    queue.offer(curNode.right);
                }
            }
            ans.add(new LinkedList<Integer>(level));
            isLeft = !isLeft;
        }
        return ans;
    }
}
