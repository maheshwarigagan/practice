package design.customStack;

public class StackWithIncrementOperation {
    int index = -1;
    int[] stack;
    int[] increment;
    public StackWithIncrementOperation(int maxSize) {
        stack = new int[maxSize];
        increment = new int[maxSize];
    }

    public void push(int x) {
        if(stack.length <= index+1){
            return;
        }
        stack[++index] = x;
    }

    public int pop() {
        if(index<0){
            return -1;
        }
        int element = stack[index];
        element += increment[index];
        if(index>0){
            increment[index-1] += increment[index];
        }
        increment[index] = 0;
        index--;
        return element;
    }

    public void increment(int k, int val) {
        int min = Math.min(k-1, index);
        if(min >= 0)
            increment[min] += val;
    }

}
