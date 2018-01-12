import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> queue=new LinkedBlockingDeque<Integer>(10);
		
		Thread producer = new Thread(new Producer(queue));
		 
        Thread consumer = new Thread(new Consumer(queue));
 
        consumer.start();
        producer.start();

	}
}
