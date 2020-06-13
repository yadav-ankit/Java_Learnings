package interview.Real;

public class Test4 {
	final int num = 10;

	static void display() {
		Runnable r = new Runnable() {
			final int num = 15;
			@Override
			public void run() {
				int num = 20;
				System.out.println(this.num);
			}
		};
		r.run();
	}

	public static void main(String[] args) {
		display();
	}

}