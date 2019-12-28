package java_8;

// SAM : Single Abstract method . No matter how many default methods you define(0..1..2..3..4..5)
interface Sample{
	
	// Writing abstract is optional
	abstract  public int play(int y);

	// Writing default is mandatory
	public default  int test() {
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
public class Functional_Interface extends AbstractClass{

	public static void main(String[] args) {
		Sample s  = (x) -> x*x; 

		System.out.println(s.play(32));
	
	AbstractClass ab = new Functional_Interface(); 
	
	
	}

}

abstract class AbstractClass{
	
	public void sing() {
		System.out.println("cycycy");
	}
	
	
}
