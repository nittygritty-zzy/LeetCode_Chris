package minStack;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> mMinStack = new Stack<Integer>();

	public void push(int x) {
		stack.push(x);
		if(!mMinStack.isEmpty()){
			int min = mMinStack.peek();
			if(x < min){
				mMinStack.push(x);
			} 
		} else {
			mMinStack.push(x);
		}

	}
	// deal with the situation that the stack pop out mininum value
	public void pop() {
		int x = stack.pop();
		if(mMinStack.size() != 0){
			if(x == mMinStack.peek()){
				mMinStack.pop();
			}
		} 
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return mMinStack.peek();
	}
}
