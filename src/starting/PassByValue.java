package starting;

// JAVA is pass by Value and not by Refrence

class Testxxx{
	
	public void play(PassByValue p) {
		p.setValue(29);
		
		System.out.println("Inside Play " + p.getValue());
	}
	
	public void swap(PassByValue p1 , PassByValue p2) {
		
		PassByValue temp = p1;
		p1=p2;
		p2=temp;
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
		PassByValue passbyValue1 = new PassByValue();
		passbyValue1.setValue(3);
		
		PassByValue passbyValue2 = new PassByValue();
		passbyValue2.setValue(8);
		
		Testxxx t = new Testxxx();
		
		System.out.println("Before  swap " + passbyValue1.getValue() + " and P2 = " + passbyValue2.getValue());
		
		t.swap(passbyValue1, passbyValue2);
		
		System.out.println("After  swap " + passbyValue1.getValue() + " and P2 = " + passbyValue2.getValue());
		
		System.out.println("\n\nLet me tell you in detail what happened...\n\nFirst we created two objects pointing to"
				+ "memory location 50 & 100 respectivley.\nNext when you called swap and send these p1 & p2 what JVM does is "
				+ "create a copy of p1 & p2\nSo ab hum jo bhi khel rhe h these are on the new created objects.\n"
				+ "These methods are destoyed as soon as the method ends.");
	}
}
