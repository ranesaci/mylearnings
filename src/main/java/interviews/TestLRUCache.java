package interviews;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

/**
* @author sachin
* @date 14-Sep-2021
*/

public class TestLRUCache {
	
	@Test
	public void testLRU() {
		LRUCache cache = new LRUCache(4);
		cache.refer(1);		cache.refer(2);		cache.refer(3);		cache.refer(10);
		cache.refer(3);		cache.refer(1);		cache.refer(9);		cache.refer(3);
		
		cache.printDoublyQueueCache();
		
		}
}
	//we will use Deque and Hashset to implement LRU
	class LRUCache {
		int INITIAL_CAPACITY = 5;
		Deque<Integer> doublyQueue;
		HashSet<Integer> hashset;
		
		public LRUCache(int capacity) {
			this.INITIAL_CAPACITY = capacity;
			doublyQueue = new LinkedList<Integer>();
			hashset = new HashSet<Integer>();
		}
		
		public void refer(int element) {
			if (!hashset.contains(element)) {
				if (doublyQueue.size() == INITIAL_CAPACITY) {
					int last = doublyQueue.removeLast();
					hashset.remove(last);
				} 
			} else {
				doublyQueue.remove(element);
			} 
			
			doublyQueue.push(element);
			hashset.add(element);
			
		}
		
		public void printDoublyQueueCache() {
			doublyQueue.forEach(System.out::println);
		}
	}
	




