package thread;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

/**
* @author sachin
* @date 12-Sep-2021
*/

public class LockInterruptibly {
	@Test
	public void testInterruptibly() throws InterruptedException {
		Lock lock = new ReentrantLock();
		Thread t0 = new MyThread(lock);
		Thread t1 = new MyThread(lock);
		
		t0.start();
		t1.start();
		
		Thread.sleep(4000); //setting lower than 5 sec as t0 will take 5 sec
		t1.interrupt();
		
		t0.join();
		t1.join();
	}
}

class MyThread extends Thread {
	
	ReentrantLock lock;
	
	public MyThread(Lock lock) {
		this.lock = (ReentrantLock) lock;
	}
	
	@Override
		public void run() {
			try {
				System.out.println(Thread.currentThread().getName() + " trying for lock");
				lock.lockInterruptibly();
				System.out.println(Thread.currentThread().getName() + " got lock");
				
				for (int i = 0; i < 5; i++) {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName() + " :" + new Date());
				}
				
			} catch (InterruptedException e) {
				
				System.out.println(Thread.currentThread().getName() + " got interuppted exception.");
				e.printStackTrace();
			} finally {
				lock.unlock();
				System.out.println(Thread.currentThread().getName() + " released lock");
			}
			
		}
}


