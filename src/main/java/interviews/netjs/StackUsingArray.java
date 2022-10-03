package interviews.netjs;

import java.util.Arrays;

public class StackUsingArray {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(4);
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		System.out.println(Arrays.toString(myStack.arr));
		myStack.push(5);//stack is full
		
		System.out.println(myStack.pop());//4
		System.out.println(myStack.pop());//3
		System.out.println(myStack.pop());//2
		System.out.println(myStack.pop());//1
		System.out.println(myStack.pop());//stack is empty!! -1
		myStack.push(10);
		System.out.println(myStack.isEmpty());//false
		
		System.out.println(myStack.isFull());//false
		System.out.println(myStack.peek());//10
		

	}

}

class MyStack {
	int[] arr;
	int maxSize;
	int top;
	
	public MyStack(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
		top = -1;
	}
	
	
	public void push(int data) {
		if (top == maxSize-1) {
			System.out.println("stack is full");
		} else {
			arr[++top] = data;
		}
	}
	
	public int pop() {
		if (top == -1) {
			System.out.println("stack is empty!!");
		} else {
			return arr[top--];
		}
		return -1;
	}
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
