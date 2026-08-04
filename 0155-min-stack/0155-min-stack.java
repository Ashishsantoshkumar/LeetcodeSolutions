class MinStack {
    Stack<Integer> ans;
    Stack<Integer> minStack;

    public MinStack() {
        ans = new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int value) {
        ans.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
        }
        else{
            minStack.push(Math.min(value,minStack.peek()));
        }

    }

    public void pop() {
        ans.pop();
        minStack.pop();
    }

    public int top() {
        return ans.peek();
    }

    public int getMin() {
        
    return minStack.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */