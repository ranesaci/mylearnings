package interviews.netjs;

public class ProducerConsumer {

	public static void main(String[] args) {
		ProducerConsumerShared producerConsumerShared = new ProducerConsumerShared();
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

class ProducerConsumerShared {
	
	int counter = 0;
	boolean flag = false;
	
	public void produce() throws InterruptedException {
		synchronized (this) {
			while(true) {
				while(flag) {
					wait();
				}
				Thread.sleep(200);
				System.out.println("produced:"+ ++counter);
				flag = true;
				notify();
			}
			}
			
		
	}
	
	public void consume() throws InterruptedException {
		synchronized (this) {
			while(true) {
				while (!flag) {
					wait();
				}
				Thread.sleep(200);
				System.out.println("Consumed:"+ counter);
				flag = false;
				notify();
			}
			}
			
	}
	
	
	
}
