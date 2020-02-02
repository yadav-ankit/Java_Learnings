package starting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

class Sample implements Comparator<Baloon> {

	@Override
	public int compare(Baloon b1, Baloon b2) {

		if (b1.getSize() > b2.getSize())
			return 1;
		else if (b1.getSize() < b2.getSize())
			return -1;
		else
			return 0;
	}

	public int findElement(int arr[], int n , int sum) {

		Set<Integer> set = new HashSet<Integer>();
		
		
		for(int i=0;i<n;i++) {
			
			if(set.contains(sum-arr[i])) {
				return 1;
			}else {
				set.add(arr[i]);
			}
		}
		
		return 0;

	}

}

public class RunClass {

	public static void main(String... sortingWithList) throws NumberFormatException, IOException {
		List<Baloon> myList = new ArrayList<Baloon>();

		int arr[] = new int[100];

		Set<Baloon> b = new TreeSet<Baloon>();

		List<Baloon> myssList = new LinkedList<Baloon>();
		Queue<Integer> q = new LinkedList<Integer>();

		// myList.add()

		myList.add(new Baloon(3));
		myList.add(new Baloon(5));
		myList.add(new Baloon(2));
		myList.add(new Baloon(1));
		myList.add(new Baloon(6));
		myList.add(new Baloon(8));
		myList.add(new Baloon(9));

		Sample s = new Sample();

		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		
		int n = Integer.parseInt(bf.readLine());

		int myarray[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			int x = Integer.parseInt(bf.readLine());
			
			myarray[i] = x;
		}
		
		System.out.println(s.findElement(myarray, n,34));
		
		double y = Double.parseDouble(bf.readLine());

		Long l = Long.parseLong(bf.readLine());

		Collections.sort(myList, s);

		// myList.stream().map(s -> System.out.println(s.getSize()));

		myList.forEach(d -> {
//			System.out.println(d.getName());
		});

		int arrr[] = new int[1000];

		List<Integer> xx = new ArrayList<Integer>();

		Map<Integer, String> hm = new HashMap<Integer, String>();

		for (Map.Entry<Integer, String> h : hm.entrySet()) {
			System.out.println(h.getValue());
		}

	}
}
