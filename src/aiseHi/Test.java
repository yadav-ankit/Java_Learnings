package aiseHi;



interface Square{
	
	int calculate(int x);
	
	public static int sample() {
		return (int) Math.random();
	}
	
	
	public default int sample2() {
		return (int) Math.random();
	}
}
public class Test  implements Square{

	public static void main(String[] args) {
		
		Square s = (int x) -> x*x;
		
		int y = s.calculate(34);

		System.out.println(y);
		
		System.out.println(new Test().sample2() + " --> " + s.sample2());
		
	}

	@Override
	public int calculate(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public  int sample2() {
		return 22;
		
	}

}
