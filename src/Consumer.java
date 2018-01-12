import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> queue;
	 
    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
 
    public void run() {
        try {
 
            while (true) {
                Integer number = queue.take();
                if(number==null)
                {
                	System.out.println("Consumer Waiting");
                }
                System.out.println("Consuming : " + number); 
                Thread.sleep(1000);
            }
            }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

