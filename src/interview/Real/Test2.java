package interview.Real;

public class Test2 {

	static {
		code(2);
	}

	static void code(int val) {
		System.out.println(val);
		;
	}

	Test2() {
		code(5);
	}

	static {
		code(4);
	}

	static {
		code(6);
	}

	static {
		new Test1();
	}

	static {
		code(8);
	}

	public static void main(String[] args) {

	}

}