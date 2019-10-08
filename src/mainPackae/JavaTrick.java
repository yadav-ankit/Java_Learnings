package mainPackae;

import java.util.ArrayList;
import java.util.List;

public class JavaTrick {

	
	public void test() {
		
	}
	
	public  void sum(int a,int b) {
		System.out.println(a + " "  + b);
		
		List<String> col1 = new ArrayList<String>();
		List<String> col2 = new ArrayList<String>();

		
		List arr[] = new List[20];
		
		arr[0] = col1;
		
	}
	
	public  void sum(Integer a,Integer b) {
		System.out.println(a + " "  + b);
	}
	public static void main(String[] args)  {
		
		JavaTrick j = new JavaTrick();
		
		j.sum(3, 4);

		Integer a = new Integer(34);
		Integer b = new Integer(99);
		
		j.sum(a, b);
		
		Play p = new Play();
		p.dislay();
		
	}

}

class Play{
	final int num = 10;
	
	public void dislay() {
		int num = 12;
		
		Runnable r = new Runnable() {
			final int num = 15;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int num = 20;
				System.out.println(this.num);
			}
		};
		r.run();
	}
}

 
/*
	1: can't write wait without try catch or throws
	2: problem of starvation and how to solve
	3: sum method as defined above
	4: Thread executors in JAVA...thread pool
	5: Difference b/w sync block(object) and static sync block(class level)
	6: ThreadFactory
	7: ThreadLocal Class
	8: Intermediate and terminate in stream
	9: Servelet LifeCycle
	10: Deployment Descriptor : web.xml
	11: Reading CSV file
*/