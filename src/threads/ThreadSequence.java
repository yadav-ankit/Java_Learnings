package threads;

/*
 * The problem is to synchronize n number of threads using JAVA
 * The idea is take thread count and print 1 in first thread, print 2 in second thread, 
 * print 3 in third thread, ….. print n in nth thread and again repeat from thread 1 infinitely.
 */

/*
 * Solution
 * First decide which to Choose? (A)Single/Shared Runnable , (B)n Threads or (C)use Executors
 * Since we need to pass reminder that is mod N to each thread ...so we need to extend Thread class. Approach (B)
 * 
 * We made lock on a seprate object. we can't use syn(this) becuse we need lock on a shared resource and
 * syn(this) means locking every 25 threads. and also we made lock object as static, other wise syn(this) and syn(lock) means same thing
 * 
 * Similarly we make num as static since it is a shared resource.
 */

// https://java2blog.com/print-sequence-3-threads-java/
public class ThreadSequence {

	static int MAX = 900;
	static int NUM_OF_THREADS = 25;
	
	public static void main(String[] args) {

		Threadd t[] = new Threadd[NUM_OF_THREADS+1];
		
		for(int i=1;i<=NUM_OF_THREADS;i++) {
			t[i] = new Threadd(i%NUM_OF_THREADS, MAX,NUM_OF_THREADS);
			t[i].start();
		}
	}

}

class Threadd extends Thread {

	int reminder;
	int maxi;
	int total_threads;
	static Object lock = new Object(); // static bcz should be shared resource
	static int num = 1; // static bcz should be shared resource

	public Threadd(int rem, int max,int total) {
		this.reminder = rem;
		this.maxi = max;
		this.total_threads = total;
	}

	@Override
	public void run() {
		while (num < maxi) {
			synchronized (lock) {
				while (num % total_threads != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + num);
				num++;
				lock.notifyAll();
			}
		}
	}

}
