package starting;

public class StringPool {

	public  static void case1() {
		String s1 = "abc";     // 1 object in String pool, instance returned from pool
		String s2 = new String("abc");   // 1 obj in Heap , instance returned from Heap
		String s3 = "abc";    // already exist in pool , instance returned from pool
		String s4 = new String("klkl");   // 2 objs 1 in Heap , 1 in Pool, instance returned from Heap
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(s1 == s2);  // false  heap == string pool
		System.out.println(s2 == s3); // true
		
		String s5 = "xyz";
		System.out.println(System.identityHashCode(s5));
	}
	
	public static  void case2() {
		String s2 = "xyz";              // its address same as s4 in above method
		System.out.println(System.identityHashCode(s2));
		}
	public static void main(String[] args) {
		
		case1();
		case2();	
	}
}
