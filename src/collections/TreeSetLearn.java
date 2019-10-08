package collections;

import java.util.Iterator;
import java.util.TreeSet;

import mainPackae.Person;

public class TreeSetLearn {

	public static void main(String... args) {
		Person p = new Person(1, "Ankit");
		Person p1 = new Person(2, "Hemant");
		Person p2 = new Person(3, "Yadav");
		Person p3 = new Person(4, "Minal");

		TreeSet<Person> tree = new TreeSet<Person>();

		try {
			tree.add(p);
			tree.add(p1);
			tree.add(p2);
			tree.add(p3);
			
			Iterator<Person> it = tree.descendingIterator();
			
			while(it.hasNext()) {
				System.out.println(it.next().getAge());
			}
			
			
		} catch (Exception e) {
			// ClassCastException in case we didn't compare objects
			System.out.println(e.toString());
		}
	}
}

