package thread;

/**
* @author sachin
* @date 11-Sep-2021
*/

public class ProcessThreadInSequence {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> { 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("in thread t1"); });
		Thread t2 = new Thread(() -> { 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("in thread t2"); });
		Thread t3 = new Thread(() -> { 
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("in thread t3"); });
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

	}

}


