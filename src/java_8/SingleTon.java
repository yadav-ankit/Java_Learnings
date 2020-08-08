package java_8;

public class SingleTon {

	private static volatile SingleTon ins;

	// 
	
	// Heap Area 
	/*
	 * Young Gen and Old Gen
	 * 
	 * Eden Space | S1 | S2
	 * 
	 * <k,v>
	 */
	
	// Array n , less < n , a[i]< n , repeating element 4 2 3 1 3 2  
	// 
	
	
	private void play() {
		arr[arr[i]];
		int arr[] = new int[5];
		for(int i=0;i<5;i++) {
			if(arr[arr[i]] >0) {
				arr[arr[i]] = -arr[i];
			}
		}
		
	}
	private SingleTon() {
	};

	
	public static SingleTon getInstance() {
		if (ins == null) {
			synchronized (ins) {
				if (ins == null) {
					ins = new SingleTon();
				}
			}
		}
		return ins;
	}
}
