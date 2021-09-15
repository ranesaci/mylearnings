package thread;

import java.util.concurrent.Semaphore;

import org.junit.Test;

/**
* @author sachin
* @date 11-Sep-2021
*/

public class ProducerConsumerUsingSemaphore {
	
	@Test
	public void test() throws InterruptedException {
		Shared shared = new Shared();
		//producder thread
		Thread producer = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
					shared.put(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		//consumer thread
		Thread consumer = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					shared.get();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});	
		
		producer.start();
		consumer.start();
		producer.join();
		consumer.join();
	}

}

class Shared {
	
	int sharedCount;
	
	Semaphore sc = new Semaphore(0);
	Semaphore sp = new Semaphore(1);
	
	public void put(int i) throws InterruptedException {
		System.out.println("sc.availablePermits:" + sc.availablePermits());
		System.out.println("sp.availablePermits:" + sp.availablePermits());
		sp.acquire();
		sharedCount = i;
		System.out.println("putting sharedCount:" + sharedCount);
		sc.release();
		System.out.println("sc.availablePermits:" + sc.availablePermits());
		System.out.println("sp.availablePermits:" + sp.availablePermits());
		
	}
	
	public int get() throws InterruptedException {
		sc.acquire();
		System.out.println("Consumed data:" + sharedCount);
		sp.release();
		return sharedCount;
		
	}
	
}


