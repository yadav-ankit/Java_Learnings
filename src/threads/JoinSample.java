package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class JoinSample implements Runnable{


	@Override
	public void run() {
		ReentrantLock lock = new ReentrantLock();
		
		try {
			lock.tryLock(1000, TimeUnit.MILLISECONDS);
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		lock.unlock();
	}
	
	public static void withReentrantLock() throws InterruptedException {
		Thread t = new Thread(new JoinSample());
		t.start();
		
		Thread t1 = new Thread(new JoinSample());
		
		t1.start();
	}
	
	public static void withoutReentrantLock() throws InterruptedException {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName() + " running");
					
						Thread.sleep(3000);	
					
					
				} catch (Exception e) {

				}

			}
		});

		//Thread t1 = t;
		
		System.out.println(Thread.currentThread().getName() + " Started");

		t.setName("t0");
		t.start();
		
		
		
		System.out.println(Thread.currentThread().getName() + " running");

		System.out.println(t.getName() + " Started");

		Thread.currentThread().join();
	}
	
	public static void main(String[] args) throws InterruptedException {

		withoutReentrantLock();
		
		withReentrantLock();

	}


}
