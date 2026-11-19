package collection.ConsumerProducerProb;

import java.util.concurrent.BlockingQueue;

/** Purpose: Encapsulates consumer behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Consumer implements Runnable{
	BlockingQueue<Message> queue;
	
	/** Purpose: Creates a consumer instance. */
	Consumer(BlockingQueue<Message> queue){
		this.queue=queue;
	}
	@Override
	
	/** Purpose: Executes the run workflow. */
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
