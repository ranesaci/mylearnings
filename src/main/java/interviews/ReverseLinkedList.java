package interviews;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

/**
* @author sachin
* @date 07-Sep-2021
*/

public class ReverseLinkedList {
	
	@Test
	public void testReverseLinkedList() {
		CustomLinkedList customLinkedList = new CustomLinkedList();
		CustomLinkedList.head = new CustomLinkedList.Node(1);
		customLinkedList.head.next = new CustomLinkedList.Node(2);
		customLinkedList.head.next.next = new  CustomLinkedList.Node(3);
		customLinkedList.head.next.next.next = new  CustomLinkedList.Node(4);
		customLinkedList.head.next.next.next.next = new  CustomLinkedList.Node(5);
		
		CustomLinkedList.Node node = new CustomLinkedList().reverse(CustomLinkedList.head);
		//test
		assertEquals(5, node.data);
		assertEquals(4, node.next.data);
		assertEquals(3, node.next.next.data);
		assertEquals(2, node.next.next.next.data);
		assertEquals(1, node.next.next.next.next.data);	
		
	}

}

class CustomLinkedList {
	
	public static Node head;
	
	public static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
			
		}
	}
	
	public Node reverse(Node node) {
		
		Node prev = null;
		Node next = null;
		Node current = node;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		
		return prev;
	}
}


