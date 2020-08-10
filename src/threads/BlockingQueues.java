package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * Implementing Producer Consumer using
 *  Blocking Queue
 */
public class BlockingQueues {

	
	
	/*   
	 * 
	 * 
	 */
	int array[] = new int[100];
	int x = 1;

	BlockingQueue<Integer> b = new ArrayBlockingQueue<Integer>(50);

	public void produce(Integer x) {
		synchronized (this) {

			try {
				b.put(x);
				System.out.println(x + " added");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void consume() {
		synchronized (this) {

			try {
				b.take();
				System.out.println(x + " Consumer");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void play(BlockingQueues b1) {
		
		Thread producer = new Thread(new Runnable() {

			@Override
			public synchronized void run() {

				while (x < 51) {
					b1.produce(x);
					System.out.println("pppppp");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public synchronized void run() {
				while (x<51) {
					b1.consume();
				System.out.println("cccccccc");
					try {
						Thread.sleep(100);
						x++;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		producer.start();
		consumer.start();

	}

	public static void main(String[] args) throws InterruptedException {

		BlockingQueues b1 = new BlockingQueues();
		b1.play(b1);

	}
}
