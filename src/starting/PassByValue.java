package starting;


class Testxxx{
	
	public void play(PassByValue p) {
		p.setValue(29);
		
		System.out.println("Inside Play " + p.getValue());
	}
}

public class PassByValue {

	int value;
	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	public static void main(String... sortingWithList) {
		PassByValue p1 = new PassByValue();
		p1.setValue(3);
		
		PassByValue p2 = new PassByValue();
		p2.setValue(8);
		
		Testxxx t = new Testxxx();
		
		System.out.println("Before " + p1.getValue());
		
		t.play(p1);
		
		System.out.println("After " + p1.getValue());
	}
}
