package com.stack;

public class StackImplementationArray {
	
	int[] stack;
	int size;
	int top;
	
	public StackImplementationArray(int size) {
		this.size = size;
		this.stack = new int[size];
		this.top =-1;
	}
	
	public void push(int n) {
		if(!isFull()) {
			top++;
			stack[top] = n;
			System.out.println("Pushed: "+ stack[top]);
		}else {
			System.out.println("Stack is full!");
		}
	}
	
	public int peek() {
		return stack[top];
	}
	
	public int pop() {
		if(!isEmpty()) {
			int temp = stack[top];
			top--;
			return temp;
		}else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}
	
	public boolean isFull() {
		return (size-1==top);
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}

	public static void main(String[] args) {
		
		
		StackImplementationArray si = new StackImplementationArray(3);
		si.push(5);
		si.push(9);;
		si.push(1);
		System.out.println(si.pop());
		System.out.println(si.pop());
		si.push(11);
		si.push(8);;
		si.push(10);
		System.out.println(si.peek());

	}

}
