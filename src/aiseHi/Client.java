package aiseHi;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
	List list = new ArrayList();
	
	list.add("h");
	list.add(2);
	
	System.out.println(list.get(0) instanceof Object);
		
	}
	
	   private static void play(){
	    	
	    	//Anything to String
	    	String s = String.valueOf(34);
	    	
	    	// float or double to int
	    	int x = (int)3.14f;
	    	int d = (int)4.1544333d;
	    	
	    	System.out.println(d);
	    	
	    	Float ft = new Float(21.222);
	    	Integer y = ft.intValue();
	    	
	    	// int to float
	    	float f = (float)98;
	    	double dd = (double)39;
	    	
	    	System.out.println(dd);
	    	
	    	//String to any datatype....Integer.parseInt( )
	    	
	    	float h = Float.parseFloat("3.14");
	    	System.out.println(h);
	  	
	    }

}
