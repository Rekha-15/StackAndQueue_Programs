package com;

/**
 * @author rekha
 * StackList is a class of public type
 * @param <T>
 */

public class StackList <T> {
	
int size;
	
  Node<T> top;   
  
  /**
   * @author rekha
   *push method used to inserting the elements into stack
   * @param <T>
   * called new Data
   */
	
	public void push(T newData) {
		Node<T> newNode = new Node<>();
		newNode.data = newData;
		newNode.next = null;
		newNode.next = top;
		top = newNode;
	}
	
	/**
	 * Show method uses to display the elements
	 *using while condition to check next node is null or not
	 *loop will be active still it reaches the null
	 * @param <T>
	 */
	
	public void show() {
		
		Node<T> currNode = top;
		while (currNode.next != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
		System.out.println(currNode.data);
	}	
	
}
