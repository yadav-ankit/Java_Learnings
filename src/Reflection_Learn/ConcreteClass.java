package Reflection_Learn;

import java.lang.reflect.Method;
import java.util.Arrays;

@Deprecated
public class ConcreteClass extends BaseClass implements BaseInterface {

	public int publicInt;
	private String privateString = "private string";
	protected boolean protectedBoolean;
	Object defaultObject;

	public ConcreteClass(int i) {
		this.publicInt = i;
	}

	@Override
	public void method1() {
		System.out.println("Method1 impl.");
	}

	@Override
	public int method2(String str) {
		System.out.println("Method2 impl.");
		return 0;
	}

	@Override
	public int method4() {
		System.out.println("Method4 overriden.");
		return 0;
	}

	public int method5(int i) {
		System.out.println("Method4 overriden.");
		return 0;
	}

	// inner classes
	public class ConcreteClassPublicClass {
	}

	private class ConcreteClassPrivateClass {
	}

	protected class ConcreteClassProtectedClass {
	}

	class ConcreteClassDefaultClass {
	}

	// member enum
	enum ConcreteClassDefaultEnum {
	}

	public enum ConcreteClassPublicEnum {
	}

	// member interface
	public interface ConcreteClassPublicInterface {
	}

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException {

		// Get Class using reflection
		Class<?> concreteClass = ConcreteClass.class;
		concreteClass = new ConcreteClass(5).getClass();
		try {
			// below method is used most of the times in frameworks like JUnit
			// Spring dependency injection, Tomcat web container
			// Eclipse auto completion of method names, hibernate, Struts2 etc.
			// because ConcreteClass is not available at compile time
			concreteClass = Class.forName("Reflection_Learn.ConcreteClass");

			System.out.println(concreteClass.getCanonicalName()); // prints com.journaldev.reflection.ConcreteClass
			/*
			 * // for primitive types, wrapper classes and arrays Class<?> booleanClass =
			 * boolean.class; System.out.println(booleanClass.getCanonicalName()); // prints
			 * boolean
			 * 
			 * Class<?> cDouble = Double.TYPE;
			 * System.out.println(cDouble.getCanonicalName()); // prints double
			 * 
			 
			Class<?> superClass = Class.forName("Reflection_Learn.ConcreteClass").getSuperclass();
			System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
			System.out.println(Object.class.getSuperclass()); // prints "null"
			System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"

			Class<?>[] classes = concreteClass.getDeclaredClasses();
			System.out.println(Arrays.toString(classes));
			
			*/
			Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class , Object.class);
			
			System.out.println(method.getReturnType());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
