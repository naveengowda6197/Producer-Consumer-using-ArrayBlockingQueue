import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable{

	ArrayBlockingQueue<TimePojo> arrayBlockingQueue;
	public Consumer(ArrayBlockingQueue<TimePojo> arrayBlockingQueue) {
		this.arrayBlockingQueue=arrayBlockingQueue;
	}
	
	public void run() {
		while(true) {
			try {
				TimePojo elemnt=this.arrayBlockingQueue.take();
				System.out.println("elemnt"+elemnt.getTime());
			}
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
}
