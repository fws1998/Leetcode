import java.util.Stack;

public class Solution1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(c);
            }else {
                if (c == stack.peek()){
                    stack.push(c);
                }else {
                    stack.pop();
                    if (stack.isEmpty()){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
