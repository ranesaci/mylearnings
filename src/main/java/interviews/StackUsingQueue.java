package interviews;

import java.util.LinkedList;
import java.util.Queue;

/**
* @author sachin
* @date 02-Sep-2021
*/

public class StackUsingQueue<E> {

	Queue<E> queue = new LinkedList<E>();
	
	public static void main(String[] args) {
		StackUsingQueue<String> stack = new StackUsingQueue<>();
		stack.push("Sachin"); stack.push("Rane"); stack.push("Pune"); 
		System.out.println("first element of stack : " + stack.pop());
		System.out.println("Second element of stack : " + stack.pop());

	}
	
	public boolean push(E element) {
		int size = queue.size();
		
		queue.add(element);
		
		//leave current added element and add all previous element towards rear
		for (int i = 0; i < size; i++) {
			E data  = queue.remove();
			queue.add(data);
		}
		return true;
	}
	
	public E pop() {
		if (!queue.isEmpty()) {
			return queue.remove();
		} else {
			return null;
		}
	}
	

}


