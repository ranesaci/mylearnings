package interviews;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

/**
* @author sachin
* @date 08-Sep-2021
*/

public class FindDeadlockThreads {
	@Test
	public void testDeadlock() throws InterruptedException {
		SharedObject obj1 = new SharedObject();
		SharedObject obj2 = new SharedObject();
		Thread t1 = new Thread(() -> {
			try {
				obj1.method1(obj2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Thread1");
		Thread t2 = new Thread(() -> {
			try {
				obj2.method1(obj1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Thread2");
		Thread t3 = new Thread(() -> {
			while (true) {
				ThreadMXBean bean = (ThreadMXBean) ManagementFactory.getThreadMXBean();
				if (null !=  bean.findDeadlockedThreads()) {
					System.out.println("Deadlocked Threads:");
					Arrays.asList(bean.getThreadInfo(bean.findDeadlockedThreads()))
					.forEach(t -> System.out.println(t.getThreadName()));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t1.start();
		t2.start(); 
		//Thread.sleep(2000);
		t3.start();
		
		t1.join();
		t2.join();
		System.out.println("This is not printed as deadlock occured");
	}

}

class SharedObject {
	public synchronized void method1 (SharedObject obj) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "called:" + new Date());
		Thread.sleep(500);
		obj.method2(this);
	}
	public synchronized void method2 (SharedObject obj) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "called:" + new Date());
		Thread.sleep(500);
		obj.method1(this);
	}
}


