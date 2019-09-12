import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

 class Baloon {

	int size;
	String name;
	
	public Baloon(int x) {
		this.size = x;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Sample implements Comparator<Baloon>{

	@Override
	public int compare(Baloon b1, Baloon b2) {
		
		if(b1.getSize() > b2.getSize())
			return 1;
		else
		if(b1.getSize() < b2.getSize())
		return -1;
		else
		return 0;
	}
	
}

public class RunClass {
	
	public static void main(String... sortingWithList) {
		List<Baloon> myList = new ArrayList<Baloon>();
		
		Set<Baloon> b = new TreeSet<Baloon>();
		
		List<Baloon> myssList = new LinkedList<Baloon>();
		Queue<Integer> q = new LinkedList<Integer>();
		
		//myList.add()		
		myList.add(new Baloon(3));
		myList.add(new Baloon(5));
		myList.add(new Baloon(2));
		myList.add(new Baloon(1));
		myList.add(new Baloon(6));
		myList.add(new Baloon(8));
		myList.add(new Baloon(9));
		
		Sample s = new Sample();
		Collections.sort(myList,s);
		
		//myList.stream().map(s -> System.out.println(s.getSize()));
		
		myList.forEach((key) -> System.out.println(key.getSize() ));
	}
}
