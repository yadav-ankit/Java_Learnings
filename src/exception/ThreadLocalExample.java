package exception;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable sharedRunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(sharedRunnableInstance);
		Thread thread2 = new Thread(sharedRunnableInstance);

		thread1.start();
		thread2.start();

		thread1.join(); // wait for thread 1 to terminate
		thread2.join(); // wait for thread 2 to terminate
	}

}

class MyRunnable implements Runnable {

	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
	private int myId;
	String s;


	@Override
	public void run() {
		threadLocal.set((int) (Math.random() * 100D));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		System.out.println(threadLocal.get());
	}

	private static void playy() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(5);
		final CountDownLatch latch = new CountDownLatch(5);

		int arr[] = new int[5];
		for (int x = 0; x < 5; x++) {
			service.submit(new Runnable() {
				@Override
				public void run() {
					// do somethinglatch.countDown();}});}
				}
			});
		}

		latch.await();
	}
}
