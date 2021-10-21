
public class Solution23 {
    public ListNode merge(ListNode[] listNodes){
        ListNode ans = null;
        for (ListNode listNode : listNodes) {
            ans = mergeTwo(ans, listNode);
        }
        return ans;
    }

    public ListNode mergeTwo(ListNode a, ListNode b){
        if (a==null || b==null){
            return a==null ?b :a;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode pointerA = a;
        ListNode pointerB = b;

        while (pointerA!=null && pointerB!=null){
            if (pointerA.val< pointerB.val){
                tail.next = pointerA;
                pointerA = pointerA.next;
            }else {
                tail.next = pointerB;
                pointerB = pointerB.next;
            }
            tail = tail.next;
        }
        tail.next = (pointerA==null ?pointerB :pointerA);
        return head.next;
    }

}
