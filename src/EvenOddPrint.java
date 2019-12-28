
public class EvenOddPrint {
	
	public static void main(String[] args) throws InterruptedException  {
		int arr[] = new int[20];

		Numbers n = new Numbers();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					while(n.number <= 10) {
					
						n.printOdd(n.number);
					}
					
				} catch (Exception e) {
					System.err.println(e);
				}
				n.number = n.number + 2;
			}
		});
		

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					while(n.number <= 10) {
						n.printEven(n.number);
					}
				} catch (Exception e) {
					System.err.println(e);
				}
				n.number = n.number + 2;
			}
		});

		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
	}
	public static class Numbers {

		int number = 1;
		boolean isOdd = true;
		 void printEven(int x) throws InterruptedException  {
			synchronized (this) {
				try {
					while(isOdd) {
						wait();
					}
				}catch(Exception e ){
					System.err.println(e);
				}
				System.out.println(x);
				isOdd = false;
				notifyAll();
			}
		}

		void printOdd(int x) throws InterruptedException  {
			synchronized (this) {
				try {
					while(!isOdd) {
						wait();
					}
					
				}catch(Exception e ){
					System.err.println(e);
				}
				System.out.println(x);
				isOdd= true;
				notifyAll();
			}
		}
	}
	

	
}

