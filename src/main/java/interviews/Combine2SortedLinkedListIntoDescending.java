package interviews;

import org.junit.Test;


/**
* @author sachin
* @date 14-Sep-2021
*/

public class Combine2SortedLinkedListIntoDescending {
	
	@org.junit.Test
	public void testAddAndReverse() {
		MyCustomLinkedList  customLinkedList = new MyCustomLinkedList();
		customLinkedList.add(1);
		customLinkedList.add(2);
		customLinkedList.add(3);
		customLinkedList.add(4);
		customLinkedList.add(5);
		System.out.println("given linked list:");
		customLinkedList.traverse();
		//reverse
		customLinkedList.reverse(customLinkedList.head);
		System.out.println("Traversing after reverse:");
		customLinkedList.traverse();
		
	}
	
	@Test
	public void testJoinTwoSortedListInDescendingOrder() {
		MyCustomLinkedList  list1 = new MyCustomLinkedList();
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		
		MyCustomLinkedList  list2 = new MyCustomLinkedList();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println("list1:");
		list1.traverse();
		System.out.println("list2:");
		list2.traverse();
		MyCustomLinkedList joined = MyCustomLinkedList.joinTwoSortedList(list1.head, list2.head);
		System.out.println("Traverse joined list");
		joined.traverse();
	}

}

class MyCustomLinkedList {
	Node head; //to store pointer of first element of list
	
	public MyCustomLinkedList() {
		
	}
	public MyCustomLinkedList(Node node) {
		head = node;
	}
	
	static class Node {
		Node next;
		int data;
		
		public Node(int value) {
			this.data = value;
			this.next = null;
		}
		
	}
	
	public void add(int value) {
		Node node = new  Node(value);
		
		if (head == null) {
			head = node;
		}else {
			Node last  = head;
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = node;
		}
	}
	
	public void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			this.head = node;
			return node;
		}
		
		Node next = node.next;
		
		Node reversed = reverse(next);
		node.next.next = node;
		node.next=null;
		
		return reversed;
		
	}
	
	public static MyCustomLinkedList joinTwoSortedList(Node node1, Node node2) {
		Node join = null;
		
		while (node1 != null || node2 != null ) {
			Node temp;
			if (node1 != null && node2 != null) {
				if (node1.data < node2.data) {
					temp = new Node(node1.data);
					node1 = node1.next;
				} else {
					temp = new Node(node2.data);
					node2 = node2.next;
				}
			} else if (node1 != null) {
				temp = new Node(node1.data);
				node1 = node1.next;
			} else {
				temp = new Node(node2.data);
				node2 = node2.next;
			}
			
			if (join == null) {
				join = temp;
				temp.next = null;
			} else {
				temp.next = join;
				join = temp;
			}
			
		}
		return new MyCustomLinkedList(join);
	}
}

