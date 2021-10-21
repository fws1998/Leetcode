import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution133 {
    public Node cloneGraph(Node node){
        HashMap<Node, Node> visited = new HashMap<>();
        if (node == null){
            return node;
        }

        if (visited.containsKey(node)){
            return visited.get(node);
        }

        Node clone = new Node(node.val, new ArrayList());
        visited.put(node, clone);

        for (Node neighbour : node.neighbours){
            clone.neighbours.add(cloneGraph(neighbour));
        }
        return clone;

    }

    public Node dfs(Node node){
        if (node == null){
            return node;
        }

        HashMap<Node, Node> visited = new HashMap<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node n = queue.remove();
            for (Node neighbour : node.neighbours){
                if (!visited.containsKey(neighbour)){
                    visited.put(neighbour, new Node(neighbour.val, new ArrayList()));
                    queue.add(neighbour);
                }
                visited.get(n).neighbours.add(visited.get(neighbour));
            }
        }
        return visited.get(node);
    }
}
