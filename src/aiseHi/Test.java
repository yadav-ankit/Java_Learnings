package aiseHi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

interface Square{
	
	int calculate(int x);
	
	public static int sample() {
		return (int) Math.random();
	}
	
	
	public default int sample2() {
		return (int) Math.random();
	}
}
public class Test  implements Square{

	public static void main(String[] args) {
		
		Square s = (int x) -> x*x;
		
		int y = s.calculate(34);

		System.out.println(y);
		
		System.out.println(new Test().sample2() + " --> " + s.sample2());
		
		LinkedList<Integer> list = new LinkedList<>();
		
		
		
		HashMap<Integer,Iterator> m = new HashMap<>();
		
		refer(m,list,34);
	}

	private static void refer(HashMap<Integer,Iterator> hm , LinkedList<Integer> list, Integer x) {
		
		Iterator it = list.listIterator();
		
		
		if(hm.get(x) == null) {
				list.removeLast();
				
		}else {
			int index = 0;
			while(it.hasNext()) {
				Integer y = (Integer) it.next();
				index++;
				if(x == y) {
					list.remove(index);
					hm.put(x, null);
				}
			}
		}
		
		list.addFirst(x);
		while(it.hasNext()) {
			Integer y = (Integer) it.next();
			if(x == y) {
				hm.put(34,it);
			}
		}
	
		
	}
	
	@Override
	public int calculate(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public  int sample2() {
		return 22;
		
	}

}
