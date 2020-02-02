package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import mainPackae.Person;

public class HashMapLearn {

	public static void sortMap() {

		Map<Integer, String> mine = new HashMap<Integer, String>();

		// To Maintain order
		LinkedHashMap<Integer, String> collect = mine.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal,
						LinkedHashMap::new));

		collect.forEach((k, v) -> System.out.println("Key is : " + k + "Value is " + v));
	}

	public static void main(String[] args) {

		Person p = new Person(1, "Ankit");
		Person p1 = new Person(2, "Hemant");
		Person p2 = new Person(3, "Yadav");
		Person p3 = new Person(4, "Minal");

		Person p4 = new Person(3, "Minal");
		Person p5 = new Person(2, "Minal");
		Person p6 = new Person(1, "Minal");
		Person p7 = new Person(3, "Minal");

		HashMap<Person, String> hm = new HashMap<Person, String>();

		hm.put(p1, "ankit");
		hm.put(p2, "ankit");
		hm.put(p3, "ankit");
		hm.put(p4, "ankit");
		hm.put(p5, "ankit");
		hm.put(p6, "ankit");
		hm.put(p7, "ankit");
		hm.put(p, "ankit");
		hm.put(p1, "ankit");
		hm.put(p1, "ankit");

		for (Map.Entry<Person, String> h : hm.entrySet()) {
			System.out.println(h.getKey().getAge() + " " + h.getKey().getName());
		}

	}

}
