package trickJavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {

	public static void main(String[] args) {
		Map<Emp, Integer> hm = new HashMap<Emp, Integer>();

		Emp e1 = new Emp(); e1.age = 34;
		Emp e2 = new Emp(); e2.age = 342;
		Emp e3 = new Emp(); e3.age = 343;

		hm.put(e1, 23);
		hm.put(e2, 12);

		System.out.println(hm.size());
		System.out.println(hm); //printing hashmap

	}

}

class Emp {

	int age;

	@Override
	public boolean equals(Object obj) {
		return true;   //play with true or false
	}

	@Override
	public int hashCode() {
		return (int) Math.random();   // make hascode return 3;
	}

}
