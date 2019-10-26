package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPool implements Runnable,ThreadFactory,Callable<ThreadPool> {

	Executors  e1;

	public static ReentrantLock ren = new ReentrantLock();
	
	ThreadFactory th = new ThreadFactory() {
		
		@Override
		public Thread newThread(Runnable r) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	
	ThreadPoolExecutor tll;
	
	//Difference b/w AtomicInteger and Volatile
	
	public void play() throws InterruptedException {
		
		ren.lock();
		
		boolean tryLockAcquired = ren.tryLock(5, TimeUnit.SECONDS);
		try {
			if(tryLockAcquired) {
				
			}
		}
		// faltu code
		finally {
			ren.unlock();	
		}
		
	}
	
	// overriding for ThreadFactory
		@Override
		public Thread newThread(Runnable r) {
			// TODO Auto-generated method stub
			return null;
		}

		// OverRiding for Callable
		@Override
		public ThreadPool call() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
	@Override
	public void run() {
		
		try {
			play();
			Thread.sleep(100);
		}catch(InterruptedException e) {
			System.err.println(e.toString());
		}
	}

	public static void main(String... args) throws InterruptedException, ExecutionException {
		ThreadPool t1 = new ThreadPool();
		
		Thread t = new Thread(new ThreadPool());
		
		Thread t2 = new Thread(new Runnable() {
			
			
			@Override
			public void run() {
				
			}
		});
		
		t2.start();
		
		 new Thread(new Runnable() {
				
				
				@Override
				public void run() {
					
				}
			}).start();
		
		int x = Runtime.getRuntime().availableProcessors();
		
		ExecutorService rr = Executors.newFixedThreadPool(x);
			
		System.gc();
		
		Runtime gfg = Runtime.getRuntime();
		
		
		
		gfg.gc();
		System.out.println(gfg.totalMemory() + " " + gfg.freeMemory());
		
		
		Callable<ThreadPool> callable = new ThreadPool();
		Callable<String> callable1 = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
			
			//Future<String>  future1 = rr.submit(callable1);
			
		};
		
		Future<ThreadPool>  future = rr.submit(callable);
		
		System.out.println(future.get());
		System.out.println(x + " Number of cores in this system");
	
		//t.start();
	}

	
	
}
