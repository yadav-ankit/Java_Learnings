package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Future and callable goes hands in Hand
public class FutureLearn {

	public static void main(String... args) throws InterruptedException, ExecutionException {

		Matrix_Using_Threads s = new Matrix_Using_Threads();
		s.startPlaying(s);
	}
}

class Offer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(" -----");
		
		// 3 8 2 9 9 1 2 3 9 1 7 4 1 2 2 3
		int i,j;
		int arr[] = new int[100];
		int n= 100;
		int sum = 0;
		
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(j-1>1) {
					sum = sum + arr[j];
					j=i;
				}
			}
		}
	}

	
}

class Sample implements Callable<Matrix_Using_Threads>{

	int x;
	String y;

	@Override
	public Matrix_Using_Threads call() throws Exception {

		Matrix_Using_Threads s = new Matrix_Using_Threads();
		s.x = 3;
		s.y = "ankit";

		Thread.currentThread();
		Thread.sleep(5000);

		return s;
	}

	public void startPlaying(Matrix_Using_Threads task) throws InterruptedException, ExecutionException {

		ExecutorService ex = Executors.newFixedThreadPool(4);
		
		// This will use Thread again and when they r available
		ExecutorService ex2 = Executors.newCachedThreadPool();

		Future<Matrix_Using_Threads> future = ex.submit(task);

		// Result will come in 5 seconds
		
		if (future.isDone()) {
			System.out.println(future.get().x + " " + future.get().y);
		} else {
			System.out.println("Ye to pehle print ho jaaega");
		}
		System.out.println(future.get().x + " " + future.get().y);
		
		
		for(int i=1;i<1000;i++) {
			ex2.execute(new Offer());
			System.out.println(i);
		}
		
		ex.shutdown();
	
		
	}
}
