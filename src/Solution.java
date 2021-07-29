import java.util.EmptyStackException;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (short i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            if(a == '(' ||a=='{'||a=='['){
                stack.push(a);
            }else{
                try{
                    short res = (short) (a-stack.pop());
                    if( !(res == 1 || res == 2)){
                        return false;
                    }
                }catch(EmptyStackException ignore){}
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean is = new Solution().isValid("()");
    }
}