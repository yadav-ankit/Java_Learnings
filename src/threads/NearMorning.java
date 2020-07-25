package threads;

public class NearMorning {

	// https://stackoverflow.com/questions/6546193/how-to-catch-an-exception-from-a-thread
	public static void playOne() {
		Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread arg0, Throwable arg1) {
				System.out.println("Yaha pakad liya in Exception Handler !!!");

			}
		};

		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread starts");
				throw new RuntimeException();
			}
		});

		try {
			t.start();
			t.setUncaughtExceptionHandler(h);
			t.join();
		} catch (Exception e) {
			System.out.println("The error is " + e);
		}
		System.out.println("Program ends !!!");
	}

	public static void playTwo() {

		// start thread t3 , t2 , t1 and finish them as t1,t2 t3

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {

			}
		});

		t3.start();
		t2.start();
		t1.start();

	}

	public static void main(String[] args) throws InterruptedException {
		// playOne();

		String test = "a1b2c3";
		String tokens[] = test.split("\\d");

		for (String s : tokens) {
			System.out.println(s);
		}
	}
}
