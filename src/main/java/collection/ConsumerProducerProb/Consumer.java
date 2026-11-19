package collection.ConsumerProducerProb;

import java.util.concurrent.BlockingQueue;

/**
 * Encapsulates consumer behavior for collection data management and lookup.
 */
public class Consumer implements Runnable{
	BlockingQueue<Message> queue;
	/**
 * Creates a configured consumer instance for the represented workflow.
 */
	Consumer(BlockingQueue<Message> queue){
		this.queue=queue;
	}
	@Override
	/**
 * Executes run processing and coordinates the required workflow.
 */
	public void run() {
		try {
			Message msg;

			while(((msg = queue.take()).getMsg() != "exit")) {
				System.out.println("Consumed Msg-"+ msg.getMsg());
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
