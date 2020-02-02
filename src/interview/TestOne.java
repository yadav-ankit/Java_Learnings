package interview;

public class TestOne {

	int x, y;

	public TestOne(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public TestOne() {
		this(10,20);
	}
	public static void main(String[] args) {
		TestOne t = new TestOne();

		System.out.println(t.x);
	}

}
