package collection.ConsumerProducerProb;

import java.util.concurrent.BlockingQueue;

/**
 * Encapsulates producer behavior for collection data management and lookup.
 */
public class Producer implements Runnable {
	
	BlockingQueue<Message> queue;
	
	/**
 * Creates a configured producer instance for the represented workflow.
 */
	Producer(BlockingQueue<Message> queue){
		this.queue = queue;
	}
	 
	
	@Override
	/**
 * Executes run processing and coordinates the required workflow.
 */
	public void run() {
		for (int i = 0; i < 100; i++) {
			Message msg = new Message("Message-"+i);
			try {
				Thread.sleep(1000);
				queue.put(msg);
				System.out.println("Produced Msg: "+ msg.getMsg());
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Message msg = new Message("exit");
		try {
			Thread.sleep(1000);
			queue.put(msg);
			System.out.println("Produced Msg: "+ msg.getMsg());
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
