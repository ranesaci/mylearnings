package interviews.netjs;

import java.util.concurrent.Semaphore;

public class ProducerConsumerUsingSemaphore {

	public static void main(String[] args) {
		ProducerConsumerSharedUsinSemaphore producerConsumerShared = new ProducerConsumerSharedUsinSemaphore();
		new  Thread(() -> {
			try {
				producerConsumerShared.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		new  Thread(() -> {
			try {
				producerConsumerShared.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		

	}

}

class ProducerConsumerSharedUsinSemaphore {
	
	Semaphore consumer = new Semaphore(0);
	Semaphore producer = new Semaphore(1);
	int counter = 0;
	
	public void produce() throws InterruptedException {
		while (true) {
			producer.acquire();
			Thread.sleep(200);
			System.out.println("produced:" + ++counter);
			consumer.release();
		}

	}
	
	public void consume() throws InterruptedException {
		while (true) {
			consumer.acquire();
			Thread.sleep(200);
			System.out.println("Consumed:" + counter);
			producer.release();
		}

	}

}
