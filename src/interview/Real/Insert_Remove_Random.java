package interview.Real;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Insert_Remove_Random {

	Insert_Remove_Random(){
		 set = new HashSet();
		 elements = new ArrayList<>();
	}


	Set<Integer> set;
	List<Integer> elements;

	public boolean insert(int val) {
		if (!set.contains(val))
			elements.add(val);
		return set.add(val);
	}

	public boolean remove(int val) {
		return set.remove(val);
	}

	/** Get a random element from the set. */
	public int getRandom() {
		int size = elements.size();
		int targetIndex = getRandomNumberInRange(0, size - 1);
		return elements.get(targetIndex);
	}

	private static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
		return r.ints(min, (max + 1)).findFirst().getAsInt();
	}

	public static void main(String[] args) {

		Insert_Remove_Random t = new Insert_Remove_Random();
		boolean b1 = t.insert(45);
		boolean b2 = t.remove(45);
		t.insert(34);
		t.insert(3);
		t.insert(22);
		t.insert(12);
		int x = t.getRandom();
		int y = t.getRandom();

		System.out.println(x + " " + y);

	}

}