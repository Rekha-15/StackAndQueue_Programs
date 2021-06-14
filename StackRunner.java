package com;

/**
 * @author rekha
 * @param <T> the type of value stored in this stack
 *
 */

public class StackRunner<T> {
	
	public static void main(String[] args) {
		StackList<Integer> stack = new StackList<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		stack.pop();
		stack.peek();
		stack.show();
	}
}
