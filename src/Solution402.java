import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class Solution402 {
    public String removeKdigits(String num, int k){
        Deque<Character> deque = new LinkedList<Character>();
        int length = num.length();

        for (int i=0; i<length; i++){
            char a = num.charAt(i);
            while (!deque.isEmpty() && k>0 && deque.peekLast()>a){
                deque.pollLast();
                k--;
            }
        }

        for (int i=0; i<k; i++){
            deque.pollLast();
        }

        StringBuilder result = new StringBuilder();
        boolean lead = true;
        while (!deque.isEmpty()){
            char digit = deque.pollFirst();
            if (lead && digit=='0'){
                continue;
            }
            lead = false;
            result.append(digit);
        }

        return result.length()==0 ?"0" :result.toString();
    }
}
