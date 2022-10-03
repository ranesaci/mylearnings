package interviews.netjs;

public class MyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	public MyLinkedList() {
		
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		if (isEmpty()) {//check if head is null or  not
			tail = node;
		}
		//if list is not empty
		
		node.next = head;
		head = node;
		size++;
		
	}
	
	public void insertLast(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head  = node;
		} else {
			tail.next = node;
		}
		
		tail = node;
		size++;
	}

	public  boolean isEmpty() {
		return head == null;
	}
	
	public void listData() {
		Node temp = head;
		if (temp != null) {
			while (temp != null) {
				System.out.print(temp.display() + " ");
				temp = temp.next;
			}
		}
	}
	
	public void insertAtIndex(int index, int value) {
		
		Node node = new Node(value);
		if (isValidIndex(index)) {
			
			if (index == 0) {
				insertFirst(value);
			} else if (index == size) {
				insertLast(value);
			}
			
			//if we index is middle value
			Node temp = head;
			int count = 0;
			Node prev = null;
			while (count < index && temp.next != null) {
				prev = temp;
				temp = temp.next;
				count++;
			}
			prev.next = node;
			node.next = temp;
			size++;
			
			
		} else {
			System.out.println("\n" + index + " index is not valid");
		}
	}
	public void add(int data) {
		insertLast(data);
	}
	
	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("List is  empty, how can you remove element!!!take some break and chill");
		}
		if (head.next == null) {
			tail = null;
		}
		head = head.next;
		size--;
	}
	public void removeLast() {
		if (isEmpty()) {
			System.out.println("List is  empty, how can you remove element!!!take some break and chill");
		}
		if (head.next == null) {//if only one element
			tail = null;
			head = null;
		}
		//find last prev element ref
		Node current = head;
		Node temp = null;
		while (current.next != null) {
			temp = current;
			current = current.next;
		}
		temp.next = null;
		tail = temp;
		size--;
	}
	
	public void removeAtIndex(int index) {
		if (!isValidIndex(index)) {
			System.out.println(index + " inde is not valid");
			return;
		}
		
		if (index == 0) {
			removeFirst();
		} else if (index == size) {
			removeLast();
		} else {
		
		Node current = head;
		Node temp = null;
		int count = 0;
		while (count < index-1 && current != null) {
			temp = current;
			current = current.next;
			count++;
		}
		System.out.println("removed node: "+ current.display());
		temp.next = current.next;
		}
		size--;
		
	}
	public Node reverse(Node nde) {
		if (nde == null || nde.next == null) {
			return nde;
		}
		
		Node nodeData = reverse(nde.next);
		nde.next.next = nde;
		nde.next=null;
		
		head = nodeData;
		return nodeData;
	}
	
	public void reverseUsingIteration() {
		Node current = head;
		
		Node prev = null;
		Node next = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	private boolean isValidIndex(int index) {
		return index >=0 && index <= size;
	}

	public static void main(String args[]) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.insertFirst(1);
		linkedList.insertFirst(2);
		linkedList.insertFirst(3);
		linkedList.insertFirst(4);
		linkedList.listData();//4 3 2 1
		System.out.println("\ninsert last:");
		MyLinkedList linkedList1 = new MyLinkedList();
		linkedList1.insertLast(1);
		linkedList1.insertLast(2);
		linkedList1.insertLast(3);
		linkedList1.insertLast(4);
		linkedList1.listData();//1 2 3 4 
		System.out.println("Insert at index:");
		
		MyLinkedList linkedList2 = new MyLinkedList();
		linkedList2.insertLast(1);
		linkedList2.insertLast(2);
		linkedList2.insertLast(3);
		linkedList2.insertLast(4);
		//insert at 2
		linkedList2.insertAtIndex(2, 22);
		linkedList2.insertAtIndex(2, 222);
		linkedList2.listData();//1 2 222 22 3 4 
		linkedList.insertAtIndex(200, 100);//200 index is not valid
		
		System.out.println("\nremove first:");
		MyLinkedList linkedList3 = new MyLinkedList();
		linkedList3.insertLast(1);
		linkedList3.insertLast(2);
		linkedList3.insertLast(3);
		linkedList3.removeFirst();
		linkedList3.listData();//2 3
		
		System.out.println("\nremove last:");
		MyLinkedList linkedList4 = new MyLinkedList();
		linkedList4.insertLast(1);
		linkedList4.insertLast(2);
		linkedList4.insertLast(3);
		linkedList4.removeLast();
		linkedList4.listData();//1 2
		System.out.println("\nRemove At index:");
		MyLinkedList linkedList5 = new MyLinkedList();
		linkedList5.insertLast(1);
		linkedList5.insertLast(2);
		linkedList5.insertLast(3);
		linkedList5.removeAtIndex(2);
		linkedList5.listData();//1 3 
		
		System.out.println("\nReversal using iteration:");
		MyLinkedList linkedList6 = new MyLinkedList();
		linkedList6.add(1);
		linkedList6.add(2);
		linkedList6.add(3);
		linkedList6.add(4);
		System.out.println("before traversal:");
		
		linkedList6.listData();//1 3 
		System.out.println("\nafter traversal:");
		linkedList6.reverse(linkedList6.head);
		linkedList6.listData();
		System.out.println("\nafter traversal using iteration:");
		linkedList6.reverseUsingIteration();
		linkedList6.listData();
		
	}

}
