package mainPackae;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	int x;
	String y;
	
	public Test(String y , int k  ) {
		this.x = k;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		
		return this.x;
		
	}
	
	@Override
	public boolean equals(Object o) {
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Test t1 = new Test("ankit",23);
		Test t2 = new Test("hemant",23);
		
		HashMap<Test,String> dict = new HashMap<Test,String>();
		
		HashMap<String,String> dd = new HashMap<String,String>();
		
		
		dd.put("Cat" , "t");
		dd.put("Cat"  , "K"); // in this case we haven't implemented Equals method so it will return true by default. So value
							// value t will be replaced by K.
		
		dict.put(t1 ,"string_one");
		dict.put(t2 , "string_two");
		
		System.out.println(dict.entrySet().size());
		
		for(Map.Entry<Test,String> h : dict.entrySet()) {
			System.out.println(h.getKey().y + " " + h.getValue());
		}
	}

}
