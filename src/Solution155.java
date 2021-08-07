import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution155 {
    class MinStack {

        /** initialize your data structure here. */
        Deque<Integer> stack = new LinkedList<>();
        Deque<Integer> minStack = new LinkedList<>();
        public MinStack() {
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            stack.push(val);
            minStack.push(Math.min(minStack.peek(), val));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
