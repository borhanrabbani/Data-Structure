package com.stack;

public class LLImplementationQueue {

	Node front;
	Node rear;

	public LLImplementationQueue() {
		front = null;
		rear = null;
	}

	public void enQueue(int n) {
		Node newNode = new Node(n);
		if(front==null) {
			front = newNode;
		}else {
			rear.next = newNode;
		}
		rear = newNode;
	}

	public int deQueue() {
		if(front==null) {
			System.out.println("deQueue not possible: ");
			return -1;
		}
		if(front.next==null) {
			int ret = front.data;
			front=null;
			return ret;
		}
		
		int temp = front.data;
		front = front.next;
		return temp;
	}
	public int peek() {
		if(front==null) {
			System.out.println("Queue is empty");
			return -1;
		}
		return front.data;
	}

	private class Node {
		int data;
		Node next;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		
//		F:()->()->()->()->():L
		
		LLImplementationQueue lq = new LLImplementationQueue();
		lq.enQueue(8);
		lq.enQueue(2);
		lq.enQueue(7);
		lq.enQueue(1);
		System.out.println(lq.deQueue());
		System.out.println(lq.deQueue());
		System.out.println(lq.peek());
		System.out.println(lq.deQueue());
		System.out.println(lq.deQueue());
		System.out.println(lq.deQueue());
		System.out.println(lq.peek());
	}

}
