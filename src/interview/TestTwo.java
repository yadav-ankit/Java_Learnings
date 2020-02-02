package interview;

class Base extends Exception{
	
}


class Derived extends Base{
	
}
public class TestTwo {

	public static void main(String[] args) {
		
		try {
			
			throw new Base();
		}catch(Derived b) {
			
		}catch(Base d) {
			
		}
	}

}
