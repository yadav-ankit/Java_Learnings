package mainPackae;

public class Interview_Thread implements Runnable{

	
	 int x;
	
	public Interview_Thread(int j) {
		this.x = j;
	}
	
	
	/*
	 * 
	 * Each thread will have its own local value of y but same value of x
	 * 
	 * Volatile will not affect in this case for y since it is not an expensive operation
	 */
	void play() {
		int y = 10;
		System.out.println(x + " " + y );
		
		x = x + 1;
		y =  y + 5;
		
		System.out.println(x + " " + y);
		
		
		System.out.println("  ----------- ");
	}
	
	
	@Override
	public void run() {
		play();
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Interview_Thread obj = new Interview_Thread(29);
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
	}

	

}
