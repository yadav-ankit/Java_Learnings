package exception;

public class ExceptionLearn implements  Cloneable{

	
	private int val;
	
	public int getVal() {
		return this.val;
	}
	
	
	public void play() throws InterruptedException, CloneNotSupportedException {
		
		try {
			test();
		}catch(NullPointerException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static void test() throws NullPointerException, InterruptedException, CloneNotSupportedException{
		ExceptionLearn ex = new ExceptionLearn();
		
		ex.val = 34;
		
		//ex.wait();
		
		ExceptionLearn ey = (ExceptionLearn) ex.clone();
		
		//ex = null;
		System.out.println(ey.getVal());
	}
	
	public static void main(String...args) throws NullPointerException, 
													InterruptedException, 
													CloneNotSupportedException, 
													InstantiationException, 
													IllegalAccessException, 
													ClassNotFoundException {
		test();
		
		ExceptionLearn ex = (ExceptionLearn)Class.forName("ExceptionLearn").newInstance();
		
	}


	
}



/*
	You don't need to Throw Unchecked Exception...Only throw checked Exception
	
*/