package interview;

import java.io.*;
import java.util.*;


public class CommentsJAVA {

	/*
	 * 1: You can return an array too private static int[] doSomething(){ }
	 * 
	 * 2: Swap ELements in Array BELOW call like this for(i=0;i<n;i++){
	 * swap(arr,i,i+4); }
	 *
	 * 3: Set a Char in a string BELOW Use toCharArray( ) and String.valueOf(arr);
	 * 
	 * 4: Take an input of space separated integers like an array see below
	 * 
	 * 5: If you want a global integer in recursion loop like max_level in leftView
	 * of Tree Use static variable.
	 * 
	 * 6: Its possible to pass a function as a parameter given that it should return
	 * given data type. for example play(int x); can be called as -->
	 * play(someFun()); someFun(){ return 34; }
	 * 
	 * 7: Iterate set of List<Integer>
	 * 
	 * Set<List<Integer>> setans = new HashSet(); 
	 * List<List<Integer>> ans = new ArrayList<>();
	 * 
	 * for(List<Integer> s: setans) { ans.add(s); }
	 * 
	 * 8: Two D Matrix and Collections.sort and Collections.binarySearch()
	 * 
	 * 9: Count Sort
	 *	 for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
	 * 
	 * 10: Pass array as a pramater without declaring it
	 * private getBill(int arr1[],int arr2[]);
	 * System.out.println(cashier.getBill(new int[] {1,2}, new int[] {1,2}));
	 *
	 */

	public static void main(String... strings) {

		//Conversions
		
		// char to int
		char c = 'r';
		int x = Integer.parseInt(String.valueOf(c));
		System.out.println(x);
		
		// String to int
		int a = Integer.parseInt("anything");
		
		//int to char
		char ch = 234;
		System.out.println(ch);
		
		
	}

	private static void swap(int arr[], int i, int j) {
		int c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

	private static void setCharInAString() {
		// Problem : set 3rd Character to 'M'
		String str = "ankit";

		char arr[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (i == 3) {
				arr[i] = 'D';
			}
		}
		str = String.valueOf(arr);
		
		// OR
		
		StringBuffer s = new StringBuffer(str);
		
		s.setCharAt(3, 'D');
		
		str = s.toString();
	}

	private static void takeInput() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String arg[] = bf.readLine().split("\\s");

		int arr[] = new int[arg.length];

		for (int i = 0; i < arg.length; i++) {
			arr[i] = Integer.parseInt(arg[i]);
		}
	}

	private static void playWithCollections() {

		// Queue
		Queue<Integer> q = new LinkedList<Integer>();

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // min heap

		pq.add(33);
		pq.offer(1);

		// Deque
		Deque<Integer> dq = new LinkedList<Integer>();

		dq.addFirst(34);
		dq.removeFirst();
		dq.addLast(343);
		dq.removeFirst();

		// PriorityQueue
		Queue<Integer> pq1 = new PriorityQueue<Integer>();
		int x = pq1.peek(); // Print
		int y = pq1.poll(); // Print and Remove

		// Stack
		Stack<Integer> s = new Stack<Integer>();
		Stack<Character> st = new Stack<Character>();
		s.push(22);
		s.pop();

		// LinkedList ka array
		int arr1[] = new int[5];
		LinkedList<Integer> arr[] = new LinkedList[5];
		LinkedList arr2[] = new LinkedList[5];

		for (int i = 0; i < 5; i++) {
			arr2[i] = new LinkedList<>();
		}

		// Iterator
		Iterator<Integer> it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Set HashSet , TreeSet , LinkedHasSet

		// Map HashMap , TreeMap , LinkedHashMap
	}

	private static void eight(int arr[][], int ele) {

		int rows = arr.length;
		int cols = arr[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println(arr[i][j]);
			}
		}

		List<Integer> list = new ArrayList<>();

		list.add(34);
		list.add(22);
		list.add(98);

		Collections.sort(list);

		int index = Collections.binarySearch(list, 77);

		if (index >= 0) {
			System.out.println("Found is true");
		}
	}

	private static void playWithHashing(String s) {
		String ans = null;

		int hash[] = new int[95];

		for (int i = 0; i < s.length(); i++) {
			hash[s.charAt(i) - 'a'] = hash[s.charAt(i) - 'a'] + 1;
		}
		int index = 0;

		char c = (char) (index + 65); // char to String
		ans = String.valueOf(c);
	}

	private static String sortAString(String given) {

		char arr[] = given.toCharArray();
		Arrays.sort(arr);
		return String.valueOf(arr);
	}

	private static void capitaliseFirstChar(String s) {

		// input I am the best
		// Output I Am The Best

		String arr[] = s.split("\\|");

		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
			if (i == 0) {
				ans = ans + temp;
			} else {
				ans = ans + " " + temp;
			}
		}

	}

	private static void convertCollections(List<String> given) {

		// list to set
		Set<String> set = new HashSet<String>(given);

		// set to arrayList
		ArrayList<String> newAns = new ArrayList<>(set);

	}

	private static void alwaysUseForEach(int arr[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		for (int a : list) {
			System.out.println(a);
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

	private static void countInArray(int arr[]) {

		// You can also use Hash Array but if array elements are -ve then use HashMap
		// you can iterate all values using hm.keySet()
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int a : arr) {
			hm.put(a, hm.getOrDefault(a, 0) + 1);
		}

		for (int a : hm.keySet()) {
			System.out.println(a);
		}
	}

	private static void allAboutpriorityQuueue(int arr[]) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (int a : arr) {
			count.put(a, count.getOrDefault(a, 0) + 1);
		}

		/* By default heap is sorted in ascending order.
		 * So the most priority element in below Q is having lowest count.
		 * Yes Heap can contain Duplicate values
		 * If you want descending order use Collections.ReverseOrder();
		 * 
		 * For having a class use compareTo method as shown below plain and simple.
		 * Remember this.count - e.count; Sorted Asc.
		 * 
		 */
		Queue<Integer> heap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));
		Queue<Element> elementHeap = new PriorityQueue<>();
		
		for (int a : arr) {
			count.put(a, count.getOrDefault(a, 0) + 1);
			
			Element e = new Element();
			e.ele = a;
			e.count = count.get(a);
			
			elementHeap.add(e);
		}
		
		
	}
}

class Element implements Comparable<Element> {

	int ele;
	int count;

	@Override
	public int compareTo(Element e) {
		return this.count - e.count;
	}
}
