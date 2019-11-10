
public class CountGet {

	volatile Boolean isEven = false;
	int x = 1;
	
	private void printOdd() throws InterruptedException {
		synchronized (this) {
			while(!isEven) {
				
				if(this.x>10)
					break;
				
				
				System.out.println(this.x);
				this.x = this.x + 1;
				isEven = true;
				wait();
				Thread.sleep(1000);
				notify();
			}
		}
	}
	

	private void printEven() throws InterruptedException {
		synchronized (this) {

			while(isEven) {
				
				if(this.x>10)
					break;
				
				System.out.println(this.x);
				this.x = this.x + 1;
				isEven = false;
				notify();
				Thread.sleep(1000);
				wait();
				
			}
		}
	}

	

	public static void main(String[] args) throws InterruptedException {

		CountGet obj = new CountGet();

		Thread odd = new Thread(new Runnable() {

			@Override
			public void run() {
				
				if(obj.x<11)
					try {
						obj.printOdd();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		});

		Thread even = new Thread(new Runnable() {

			@Override
			public void run() {
				
				if(obj.x<11)
					try {
						obj.printEven();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		});

		odd.start();
		even.start();
		
		odd.join();
		even.join();
		
		System.out.println("both thread ended");
	}

}
