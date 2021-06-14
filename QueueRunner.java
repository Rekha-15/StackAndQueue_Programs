package com;

public class QueueRunner {
	
	public static void main(String[] args) {
		QueueList<Integer> queue = new QueueList<Integer>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.show();
		queue.dequeue();
		queue.show();
	}
}

