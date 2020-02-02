package interview;

public class TestThree {

	public static void main(String[] args) {

		int out = 10;
		boolean b1 = false;
		
		if((b1 == true) && (out+=10)== 20) {
			System.out.println("Equal " + out);
		}else {
			System.out.println("Not Equal " + out);
		}
	}

}
