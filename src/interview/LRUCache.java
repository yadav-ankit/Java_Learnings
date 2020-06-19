package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {

	private static void lruCache(Integer n) throws NumberFormatException, IOException {

		Deque<Integer> queue = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			Integer key = Integer.parseInt(br.readLine());
			if (!set.contains(key)) {
				if (queue.size() == n) {
					queue.removeLast();
				}
			} else {
				set.remove(key);
				Iterator<Integer> it = (Iterator<Integer>) queue.iterator();
				while(it.hasNext()) {
					if(it.next() == key) {
						queue.remove(it);
					}
				}
			}

			queue.addFirst(key);
			set.add(key);

			t = t - 1;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer size_of_cache = Integer.parseInt(br.readLine());

		lruCache(size_of_cache);
	}

}
