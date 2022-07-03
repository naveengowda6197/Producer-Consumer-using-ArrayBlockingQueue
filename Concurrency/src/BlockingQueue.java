import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueue {
	public static void main(String...strings )  {
		ArrayBlockingQueue<TimePojo> blockingQueue= new ArrayBlockingQueue<TimePojo>(10);
		Producer producer =new Producer(blockingQueue);
		Consumer consumer=new Consumer(blockingQueue);
		Thread thread=new Thread(producer);
		Thread thread1=new Thread(producer);
		
		Thread thread2=new Thread(consumer);
		Thread thread3=new Thread(producer);
		Thread thread4=new Thread(producer);
		thread.start();
		
		thread2.start();
		thread3.start();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread4.start();
		thread1.start();
		/*
		try {
			blockingQueue.put("naveen");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String var="a";
		try {
			var = blockingQueue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(var);
		String var1="a";
		try {
			var1 = blockingQueue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(var);
		System.out.println(var1);
		*/
	}
}
