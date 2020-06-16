package threads;

public class Sequence {

	int num = 1;

	public static void main(String[] args) throws InterruptedException {

		Sequence s = new Sequence();

		Thread t1 = new Thread(new Runnable() {
			// 1 4 7 10 13 16 19
			@Override
			public void run() {
				synchronized (s) {
					while (s.num < 21) {
						try {
							if(s.num % 3 == 1) {
								System.out.println("Thread 1 prints " + s.num);
								s.num = s.num + 1;
							}
							while ((s.num % 3 == 2 || s.num % 3 == 0)) {
								s.wait();
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						s.notifyAll();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			// 2 5 8 11 14 17 20
			@Override
			public void run() {
				synchronized (s) {
					while (s.num < 21) {
						if(s.num % 3 == 2) {
							System.out.println("Thread 2 prints " + s.num);	
							s.num = s.num + 1;
						}
						try {
							while ((s.num % 3 == 1 || s.num % 3 == 0)) {
								s.wait();
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						s.notifyAll();
					}
				}
			}
		});

		Thread t3 = new Thread(new Runnable() {
			// 3 6 9 12 15 18
			@Override
			public void run() {
				synchronized (s) {
					while (s.num < 21) {
						try {
							if(s.num%3 == 0) {
								System.out.println("Thread 3 prints " + s.num);
								s.num = s.num + 1;
							}
							
							while ((s.num % 3 == 1 || s.num % 3 == 2)) {
								s.wait();
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						s.notifyAll();
					}
				}
			}
		});

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

	}

}
