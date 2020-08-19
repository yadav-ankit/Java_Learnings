package starting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Medium {

	/*
	 * input: [4, 4, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4] output: [4, 0, 1, 2, 3]
	 * 
	 */
	public static void main(String[] args) {

		int arr[] = { 4, 4, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		remove_duplicate(arr);
	}

	static void remove_duplicate(int arr[]) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

	for(Integer it : set) {
		System.out.println(it);
	}

	}

}
