import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable
{
	BlockingQueue<Integer> queue;
	 
    public Producer (BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
 
    public void run() {
        try {
            
        	for (int i = 0; i < 10; i++) {
        		int number=new Integer((int) (Math.random() * 100));
                System.out.println("Producing : " + number);
                queue.put(number);
                Thread.sleep(500);
            }
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

