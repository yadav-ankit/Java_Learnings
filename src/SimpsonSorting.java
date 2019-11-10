import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

class Person implements Comparable<Person> {
    String name;
    int x;

    public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	// for default ordering
    Person(String name , int x) {
        this.name = name;
        this.x = x;
    }

    @Override
    public int compareTo(Person Person) {
        
    	return (this.x - Person.x);
    }
    
    @Override
    public boolean equals(Object o) {
    	
    	if(o == null)
    		return false;
    	
    	if(!(o instanceof Person)) {
			return false;
			
		}
    	Person new_name = (Person) o;
    	
    	Person s = (Person)o;
    	
		return this.name == s.name;
    }
    
    @Override
    public int hashCode() {
    	return  (int) (Math.random() * this.x *100) ;
    }
}

class Test  implements Comparator<Person>{

	
	// for providing how to compare object.
	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class SimpsonSorting {
	public static void main(String... sortingWithList) {
        List<Person> persons = new ArrayList<>();
        
        
        persons.add(new Person("Homer " , 1));
        persons.add(new Person("Marge " , 2));
        persons.add(new Person("Bart ", 6));
        persons.add(new Person("Lisa " , 9));
        
        
        
        List<String> list = new  CopyOnWriteArrayList<String>();// ArrayList<String>();
        
        list.add("add");
        
        list.add("yehlo");
        
        list.add("popo");
        
        list.add("apple");
        
        
        Iterator<String> it = list.iterator();
        
        while(it.hasNext()) {
        	
        //	System.out.println(it.next());
        	
        	list.add("ankit");
        }
        
        Test t = new Test();
        
        Collections.sort(persons);
       // persons.stream().forEach(p -> System.out.println(p.name + " " + p.x));
        
        Collections.sort(persons,t);
        
        
        
        persons.stream().forEach(System.out::println);
        
        MyConsumer m = new MyConsumer();
        persons.forEach(m);
        
       // simpsons.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(persons);
        //simpsons.stream().forEach(System.out::print);
    }	
}

class MyConsumer implements Consumer<Person>{
	

	@Override
	public void accept(Person s) {
	//	System.out.println(s.getName() + " " + s.getX());
		
	}
}
