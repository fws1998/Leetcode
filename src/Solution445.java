import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Deque<Integer> stack1 = new LinkedList<Integer>();
        Deque<Integer> stack2 = new LinkedList<Integer>();

        while (l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;

        ListNode ans = null;

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry !=0){
            int a = stack1.isEmpty() ?0 :stack1.pop();
            int b = stack2.isEmpty() ?0 :stack2.pop();
            int current = a+b+carry;
            carry = current/10;
            current %= 10;
            ListNode curnode = new ListNode(current);
            curnode.next = ans;
            ans = curnode;
        }
        return ans;
    }
}
