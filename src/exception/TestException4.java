package exception;
import java.io.IOException;

/*
 * 
 * 
 Unchecked Exception List (No Java code require)
 
ArrayIndexOutOfBoundsException
ClassCastException
IllegalArgumentException
IllegalStateException
NullPointerException
NumberFormatException
AssertionError
ExceptionInInitializerError
StackOverflowError
NoClassDefFoundError

Checked Exception List (You have to throws them and try catch them)

Exception
IOException
FileNotFoundException
ParseException
ClassNotFoundException
CloneNotSupportedException
InstantiationException
InterruptedException
NoSuchMethodException
NoSuchFieldException
 */

public class TestException4 {

	public void start() throws IOException{		
	}
	
	public void foo() throws NullPointerException{
		
	}
}

class TestException5 extends TestException4{
	
	public void start() throws Exception{
	}
	
	public void foo() throws RuntimeException{
		
	}
	
	/*
	 * 
	 public void start( ) is valid
	 */
}


/*
 * As per rules of method overriding in Java, an overridden method can not throw Checked Exception 
 * which is higher in hierarchy than original method. Since here start() is throwing IOException 
 * in super class, start() in sub class can only throw either IOException or any sub class of IOException
 * but not super class of IOException e.g. Exception.
 * 
 * The above program won’t compile because start() method signature is not same in subclass. 
 * To fix this issue, we can either change the method signature in subclass to be exact same
 *  as superclass or we can remove throws clause from subclass method as shown below.
*/