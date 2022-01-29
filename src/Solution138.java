import java.util.HashMap;

public class Solution138 {
    public Node CopyRandom(Node head){
        if (head==null){
            return head;
        }

        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();

        while (cur!=null){
            map.put(cur, new Node(cur.val));

        }
    }
}
