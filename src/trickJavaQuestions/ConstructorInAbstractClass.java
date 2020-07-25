package trickJavaQuestions;

public abstract class ConstructorInAbstractClass {

	int xy;
	
	ConstructorInAbstractClass(int h){
		this.xy = h;
	}

}

class Child extends ConstructorInAbstractClass {
	
	Child(int h) {
		super(h);
	}

	public static void main(String[] args) {
		ConstructorInAbstractClass obj = new Child(22);
	}
}
