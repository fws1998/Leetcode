public class Solution32 {
    public int longestValidParentheses(String s) {
        short length = (short)(s.length()-1);
        short left = 0;
        short right = 0;
        short count = 0;
        while(length>=0){
            char a = s.charAt(length);
            switch (a) {
                case ')' -> right++;
                case '(' -> left++;
            }
            if (left == right) {
                count = (short) Math.max(count, 2 * right);
            } else if (left > right) {
                left = right = 0;
            }
            length--;
        }
    return count;
    }
}
