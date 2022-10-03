package interviews.netjs;

public class Node {
	int value;
	Node next;
	
	public Node(int val) {
		value = val;
		next = null;
	}
	
	public int display() {
		return value;
	}

}
