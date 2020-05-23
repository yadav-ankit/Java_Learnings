package interview;

import java.io.*;
import java.util.*;

public class LRUCache {

	private static void lruCache(Integer n) throws NumberFormatException, IOException{
		
		Deque<Integer> queue = new LinkedList<Integer>();
		HashMap<Integer,Iterator<Integer>> map = new HashMap<Integer,Iterator<Integer>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		while(t>0) {
			Integer key = Integer.parseInt(br.readLine());
			Iterator<Integer> it = (Iterator<Integer>) queue.spliterator();
			
			if(!map.containsKey(key)) {
				
				if(queue.size() ==n) {
					queue.removeLast();
				}
			}else {
				
			}
			
			queue.addFirst(key);
			it = queue.iterator();
			map.put(key, it);
			
			t = t-1;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer size_of_cache = Integer.parseInt(br.readLine());
		
		lruCache(size_of_cache);
	}

}
