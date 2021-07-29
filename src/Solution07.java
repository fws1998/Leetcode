import java.util.PriorityQueue;
import java.util.Stack;

public class Solution07 {
    public int reverse(int x) {
        int origin = x,result = 0;
        while (origin != 0) {
            if (result > Integer.MAX_VALUE/10 ||
                    (result == Integer.MAX_VALUE / 10 && origin%10 > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 ||
                    (result == Integer.MIN_VALUE / 10 && origin%10 < -8)) return 0;
            result = result * 10 + origin % 10;
            origin = origin / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution07().reverse(1534236469);
    }
}
