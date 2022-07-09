package com.stack;

public class StackLinkedList {
	Node head;

	public StackLinkedList() {
		head = null;
	}

	public void push(int data) {
		Node prev = head;
		head = new Node();
		head.data = data;
		head.next = prev;
	}

	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty!");
		}
		int ret = head.data;
		head = head.next;
		return ret;

	}

	public int peek() {
		if (head == null) {
			System.out.println("Stack is empty");
		}
		return head.data;
	}

	private class Node
	{
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}

		public Node() {

		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		
		StackLinkedList sll = new StackLinkedList();
		sll.push(4);
		sll.push(2);
		sll.push(9);
		sll.push(3);
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.peek());

	}

}
