import java.util.List;

public class Solution141 {
    //快慢指针判断环
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){ //空链表或只有一个节点
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow!=fast){
            if (fast==null || fast.next==null){//无循环
                return false;
            }
            slow=slow.next; //挪动一个
            fast = fast.next.next; //挪动两个
        }
        //快指针套圈慢指针，有环
        return true;
    }
}
