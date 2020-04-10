package stack.minstack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minimum;

    /** initialize your data structure here. */
    public MinStack() {
        minimum = new Stack<>();
        stack = new Stack();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            minimum.push(x);
        }else{
            if(x<minimum.peek()){
                minimum.push(x);
            }else{
                minimum.push(minimum.peek());
            }
        }
        stack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
            minimum.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minimum.peek();
    }
}
