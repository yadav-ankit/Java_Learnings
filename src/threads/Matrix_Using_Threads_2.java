package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix_Using_Threads_2 {
	/*
	 * Here i have extended thread class..because I need to pass diff (row_num) values to diff thread
	 * If i have to pass same value to all thread class then i can use implements Runnable
	 * Off course in the second scenario i may have used ThreadLocal but i don't see it how.
	 */
	public static void main(String[] args) throws InterruptedException {
		int rows = 3;
		MyThread t[] = new MyThread[rows];
		for (int i = 0; i < rows; i++) {
			t[i] = new MyThread();
			t[i].index = i;
			t[i].start();
		}
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<rows;i++) {
			list.add(t[i].mini);
			t[i].join();
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}

class MyThread extends Thread {

	int arr[][] = { { 34, 22, 17 },
					{ 11, 36, 21 },
					{ 52, 4, 99 } };
	int row = 3,col = 3;
	int index = 0;
	int mini = 98989898;
	
	@Override
	public void run() {
		for(int j=0;j<col;j++) {
			if(this.arr[index][j]<mini) {
				mini = this.arr[index][j];
			}
		}
	}

}