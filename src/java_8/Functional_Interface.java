package java_8;

// SAM : Single Abstract method . No matter how many default methods you define
interface Sample{
	
	abstract  public int play(int y);

	
	public default int test() {
		return 35;
	}
	
	public default int test_1() {
		return 35;
	}
	
	public default int test_again() {
		return 35;
	}
	public default int test_run() {
		return 35;
	}
	
	
	
}
public class Functional_Interface {

	public static void main(String[] args) {
		Sample s  = (x) -> x*x; 

		System.out.println(s.play(32));
	}

}
