package starting;

public class PlayingWithStrings {

	

	
	public static void main(String... doesntMatter) {
			String s1= "abc";   //	Address a
		    String s2 = new String("abc");	//	Address b
		    String s3= "abc"; 	//	Address a
		    String s4 = new String("abc");	//	Address c
		    String s5= "abc";	//	Address a
		    String s6 = s1.substring(1);	//	Address D will create new string
		    
		    s1 = s1.substring(1);  // Old s1 is discared for GC

		    System.out.println(Integer.toHexString(s1.hashCode()));
		    System.out.println(Integer.toHexString(s2.hashCode()));
		    System.out.println(Integer.toHexString(s3.hashCode()));
		    System.out.println(System.identityHashCode(s1));
		    System.out.println(System.identityHashCode(s2));
		    System.out.println(System.identityHashCode(s3));
		  
		    System.out.println(System.identityHashCode(s4));
		    System.out.println(System.identityHashCode(s5));
		    System.out.println(System.identityHashCode(s6));

	}
}
