import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> neighbours;

    public Node(int val, ArrayList arrayList) {
        this.val = val;
        this.neighbours = arrayList;
    }
}
