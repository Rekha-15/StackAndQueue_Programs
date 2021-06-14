package com;

/**
 * @author rekha
 * StackList is a class of public type
 * @param <T>
 */


public class QueueList <T> {
	
	int size;
	
	Node<T> top;
	
   
   /**
   * @author rekha
   *enqueue method used to inserting the elements into queue
   * @param <T>
   * called new Data
   */
	
	public void enqueue(T newData) {
		Node<T> newNode = new Node<T>();
		newNode.data = newData ;
		newNode.next = null;
		if (top == null) {
			top = newNode;
		} 
		else {
			Node<T> currNode = top;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
	}
	
	
	/**
	 * Show method uses to display the elements
	 *using while condition to check next node is null or not
	 *loop will be active still it reaches the null
	 * @param <T>
	 */
	
public void show() {
		
		Node<T> currNode = top;
		System.out.println("The Queue Elements : ");
		while (currNode.next != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
		System.out.println(currNode.data);
	}	
	
      public boolean isEmpty() {
		
		return size ==0;
	}
}
