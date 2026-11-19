package collection.ConsumerProducerProb;

import java.util.concurrent.BlockingQueue;

/** Purpose: Encapsulates producer behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Producer implements Runnable {
	
	BlockingQueue<Message> queue;

	/** Purpose: Creates a producer instance. */
	Producer(BlockingQueue<Message> queue){
		this.queue = queue;
	}

	@Override
	
	/** Purpose: Executes the run workflow. */
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
