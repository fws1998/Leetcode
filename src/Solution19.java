public class Solution19 {
    public ListNode removeNth(ListNode head, int n){
        int length = 1;
        ListNode copyHead = new ListNode(head.val, head.next);
        while (head.next!=null){
            length++;
            head = head.next;
        }

        for (int i=0; i<length-n+1; i++){
            copyHead = copyHead.next;
        }

        copyHead.next = copyHead.next.next;
        return copyHead;
    }
}
