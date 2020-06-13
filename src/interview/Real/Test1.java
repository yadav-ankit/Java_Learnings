package interview.Real;

public class Test1 {

	void fun() {
		try {

			String s = null;
			System.out.println(1);

			try {
				System.out.println(s.length());

			} catch (NullPointerException e) {
				System.out.println("inner");
			}
		} catch (NullPointerException e) {
			System.out.println("outer");
		}
	}

	public static void main(String[] args) {

		Test1 t = new Test1();
		t.fun();
		
		"hackerearth".chars().distinct().peek(ch -> System.out.println(ch)).sorted();
	}
}
