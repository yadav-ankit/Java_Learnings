package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class CommentsJAVA {

	
	/*
	 * 1: You can return an array too
	 *    private static int[] doSomething(){
	 *    }
	 *    
	 * 2: Swap ELements in Array BELOW    call like this 
	 * for(i=0;i<n;i++){
	 * 	swap(arr,i,i+4);
	 * 	}
	 *
	 * 3: Set a Char in a string BELOW
	 *    Use toCharArray( ) and String.valueOf(arr);
	 *   
	 * 4: Take an input of space separated integers like an array see below
	 * 
	 * 5: If you want a global integer in recursion loop like max_level in leftView of Tree
	 * 		Use static variable.
	 * 
	 * 6: Its possible to pass a function as a parameter given that it should return given data type.
	 *   for example
	 *   play(int x);      can be called as -->  play(someFun());
	 *   someFun(){
	 *    return 34;
	 *    }
	 *    
	 *  7:   Iterate set of List<Integer>
	 *  
	 *  Set<List<Integer>> setans = new HashSet();
		 List<List<Integer>> ans = new ArrayList<>();
		 
		 for(List<Integer> s: setans) {
			 ans.add(s);
		 }
		 
		 8: Two D Matrix and Collections.sort and Collections.binarySearch()
	 *   
	 *
	 */
	
	 
	
	
	private static void swap(int arr[],int i,int j) {
		int c = arr[i];
		arr[i]= arr[j];
		 arr[j]= c;
	}
	
	private static void setCharInAString() {
		//Problem : set 3rd Character to 'M'
		String str = "ankit";
		
		char arr[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(i==3) {
				arr[i] = 'D';
			}
		}
		str = String.valueOf(arr);
	}
	
	private static void takeInput() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String arg[] = bf.readLine().split("\\s");
		
		int arr[] = new int[arg.length];
		
		for(int i=0;i<arg.length;i++) {
			arr[i] = Integer.parseInt(arg[i]);
		}
	}
	
	private static void playWithCollections() {
		
		// Queue
		Queue<Integer> q = new LinkedList<Integer>();
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();   //min heap
		
		pq.add(33);
		pq.offer(1);
		
		//Deque
		Deque<Integer> dq = new LinkedList<Integer>();
		 
		 dq.addFirst(34);
		 dq.removeFirst();
		 dq.addLast(343);
		 dq.removeFirst();
		 
		 
		 //PriorityQueue
		 Queue<Integer> pq = new PriorityQueue<Integer>();
		 int x = pq.peek(); // Print
		 int y = pq.poll(); //Print and Remove
		 
		 //Stack
		 Stack<Integer> s = new Stack<Integer>();
		 s.push(22);
		 s.pop();
		 
		 //LinkedList ka array
		 int arr1[] = new int[5];
		 LinkedList<Integer> arr[] = new LinkedList[5];
		 LinkedList arr2[] = new LinkedList[5];
		 
		 for(int i=0;i<5;i++) {
			 arr2[i] = new LinkedList<>();
		 }
		 
		 
		 //Iterator
		 Iterator<Integer> it = q.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 // Set  HashSet , TreeSet , LinkedHasSet 
		 
		 
		 // Map HashMap , TreeMap , LinkedHashMap
	}
	
	private static void eight(int arr[][],int ele) {
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		list.add(34);
		list.add(22);
		list.add(98);
		
		Collections.sort(list);
		
		int index = Collections.binarySearch(list, 77);
		
		if(index>=0) {
			System.out.println("Found is true");
		}
	}
	
}
