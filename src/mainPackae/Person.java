package mainPackae;


public class Person implements Comparable<Person>{

	private int age;
	private String name;

	public Person(int a, String n) {
		this.age = a;
		this.name = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		
		return (this.age - p.age);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o == null)
		return false;
		
		if( !(o instanceof Person))
			return false;
		
		Person p = (Person)o;
		
		return (age == p.age && name == p.name);
			
	}
	
	@Override
	public int hashCode() {
		return  (int)(Math.random() + age )% 1007;
	}

}
