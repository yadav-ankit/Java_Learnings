package threads;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Matrix_Using_Threads {

	private static Sample s;

	Matrix_Using_Threads() {
	}

	public static Sample getInstance() {
		return Inner.getInstance();
	}

	private static class Inner {

		public static Sample getInstance() {
			if (s == null) {
				return new Sample();
			}
			return s;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// n*m
		// smallest element from matrix
		int arr[][] = {{34,22,17},{11,36,21},{52,4,99}};
		
		int min = Integer.MAX_VALUE;
		ExecutorService ex = Executors.newFixedThreadPool(3);
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		CountDownLatch latch = new CountDownLatch(3);
		for (int i = 0; i < 3; i++) {
			final int count = i;
			ex.submit(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 3; j++) {
						if (arr[count][j] < min) {
							list.add(arr[count][j]);
						}
						latch.countDown();
					}
				}
			});
		}
		
		latch.await();
		Collections.sort(list);
		ex.shutdown();

		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println(list.get(0));
	}

}
