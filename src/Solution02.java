import java.util.ArrayList;

public class Solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        byte exp = 0;
        byte carry = 0;
        ArrayList<ListNode> result = new ArrayList<>();
        while(l1!=null || l2!=null){
            byte n1 = (byte) (l1 != null ? l1.val : 0);
            byte n2 = (byte) (l2 != null ? l2.val : 0);
            byte sum = (byte) (n1+n2+carry);
            carry = (byte) (sum/10);
            result.add(exp, new ListNode(sum%10));
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        return null;
    }

}
