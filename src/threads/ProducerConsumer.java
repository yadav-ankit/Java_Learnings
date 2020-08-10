package threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Problem: There is a resource An queue of size 5 , 
 * 			There is one producer , one consumer.
 */
public class ProducerConsumer {
	static int SIZE = 5;
	static Queue<Integer> q = new LinkedList<>();

	super();
	
	private void ProducerConsumer () {
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				while (q.size() < SIZE) {
					synchronized (this) {

						Random ran = new Random();
						int x = ran.nextInt(6) + 5;
						System.out.println("Added " + x);
						q.add(x);
						notify();
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				while (q.size() > 0) {
					synchronized (this) {
						System.out.println("Removed " + q.peek());
						q.poll();
						notify();
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		producer.start();
		consumer.start();

		producer.join();
		consumer.join();

		System.out.println("Ended");
	}
}