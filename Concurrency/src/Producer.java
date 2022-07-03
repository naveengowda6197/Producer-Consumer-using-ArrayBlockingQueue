import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable{
	ArrayBlockingQueue<TimePojo> queue;
	public  Producer(ArrayBlockingQueue<TimePojo> blockingQueue) {
		this.queue=blockingQueue;
		
	}
	@Override
	public void run() {
		while(true)
		{
		//	Long timeMillis=System.currentTimeMillis();
		//	TimePojo pojo= new TimePojo(timeMillis);
			try {
				this.queue.put(new TimePojo(System.currentTimeMillis()));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
