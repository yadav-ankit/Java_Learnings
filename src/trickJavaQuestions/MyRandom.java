package trickJavaQuestions;

public class MyRandom<T> {

	Employee emp;
	T a;
	public MyRandom(Employee e,T a) {
		this.emp = e;
		this.a = a;
	}

	// A Generic method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 
    
	private static <T> void play(T t) {
		System.out.println(t);
	}
	public Employee getEmp() {
		// Clone object
		return emp;
	}

	public static void main(String[] args) {

		play();
		// map key is dept and map value is List of empl

		// emplist.stream().map(e -> e.did).collect(Collectors.toMap(keyMapper,
		// valueMapper));
		// method refrencesi

		int sum = 0;
		for (int i = 0, j = 0; i < 2 && j < 2; ++i, j = i + 1)
			sum += i;

		System.out.println(sum);

	}

}

class Employee {
	int eid;
	int did;
	String name;

	@Override
	public int hashCode() {
		return eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
