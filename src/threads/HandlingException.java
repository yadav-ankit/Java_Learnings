package threads;

public class HandlingException {
	public static void main(String[] args) throws InterruptedException {
		HandlingException test = new HandlingException();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					this.wait();
					wait();
					test.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (3 != 4) {
					throw new ArrayIndexOutOfBoundsException();
				} else {
					System.out.println("Mark as complete !!!");
				}
			}
		});

		t.setName("XYXYXY---?");
		t.setUncaughtExceptionHandler(new LastChanceHandler());
		t.start();
		Thread.sleep(1000);

		t.join();
		System.out.println("In the main thread");
	}
}

class LastChanceHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable arg1) {

		System.out.println("Got the exception " + t.getName());
	}

}
