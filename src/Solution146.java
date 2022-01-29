import java.util.HashMap;

public class Solution146 {
    class DLinkNode{
        int key;
        int value;
        DLinkNode previous;
        DLinkNode next;

        public DLinkNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public DLinkNode() {
        }
    }

    public HashMap<Integer, DLinkNode> map = new HashMap<>();
    public int size;
    public int cap;
    public DLinkNode head;
    public DLinkNode tail;

    public Solution146(int cap) {
        size=0;
        this.cap = cap;

        head = new DLinkNode();
        tail = new DLinkNode();
        head.next=tail;
        tail.previous = head;
    }

    public int get(int key){
        DLinkNode node = map.get(key);
        if (node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void removeNode(DLinkNode node){
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    private void addToHead(DLinkNode node){
        node.previous = head;
        node.next = head.next;
        head.next.previous = node;
        head.next = node;
    }

    public void moveToHead(DLinkNode node){
        removeNode(node);
        addToHead(node);
    }

    public DLinkNode removeTail(){
        DLinkNode res = tail.previous;
        removeNode(res);
        return res;
    }

    public void put(int key, int val){
        DLinkNode node = map.get(key);
        if (node == null){
            DLinkNode newNode = new DLinkNode(key, val);
            map.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size>cap){
                DLinkNode tail = removeTail();
                map.remove(tail.key);
                size--;
            }
        }else {
            node.value = val;
            moveToHead(node);
        }
    }
}
