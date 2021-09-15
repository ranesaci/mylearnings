package thread;

import java.util.concurrent.Semaphore;

import org.junit.Test;

/**
* @author sachin
* @date 11-Sep-2021
*/

public class PrintOddEvenUsingSemaphore {
	@Test
	public void test() throws InterruptedException {
		SharedOddEven sharedOddEven = new SharedOddEven();
		
		Thread odd = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					sharedOddEven.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Thead-odd");
		
		Thread even = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					sharedOddEven.printEven();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}, "Thead-even");
		
		odd.start();
		even.start();
		
		odd.join();
		even.join();
	}
	
}


class SharedOddEven {
	
	 int counter = 1;
	 
	 Semaphore oddSemaphore = new Semaphore(1);
	 Semaphore evenSemaphore = new Semaphore(0);
	 
	 public void printOdd() throws InterruptedException {
		 Thread.sleep(100);
		 oddSemaphore.acquire();
		 System.out.println(Thread.currentThread().getName() + " printed:" + counter);
		 counter++;
		 evenSemaphore.release();
	 }
	 
	 public void printEven() throws InterruptedException {
		 Thread.sleep(100);
		 evenSemaphore.acquire();
		 System.out.println(Thread.currentThread().getName() + " printed:" + counter);
		 counter++;
		 oddSemaphore.release();
	 }
}


