package thread;

import java.util.concurrent.Exchanger;

/**
* @author sachin
* @date 11-Sep-2021
*/

public class ExchangerDemo {
	public static void main(String[] args) {
		
		Exchanger<String> exchanger = new Exchanger<String>();
		
		//producder thread
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(100);
						System.out.println("Producer prducing item: "+i);
						String str = exchanger.exchange("item:"+i);
						System.out.println("Produced received:"+ str);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}).start();
		
		//consumer Thread
		new Thread(new Runnable() {
					
					@Override
					public void run() {
						int count = 0;
						String str;
						while (count < 3) {
							
							try {
								str = exchanger.exchange("Acknowledgement for :"+ count);
								System.out.println("Consumer received:"+ str);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							count++;
						}
						
					}
				}).start();
				
	}

}


