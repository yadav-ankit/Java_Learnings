package exception;

public class MostAsked {

	
	@SuppressWarnings("finally")
	private static int playOne() {
		String s = null;
		
		try {
			System.out.println(s.length());
			return 34;
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("Kuch print hota h??");
			return 75;
		}finally {
			// return 90; if no return in finally then return from catch after completing finally
			return 90;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(playOne());
	}

}

/*
 * 1: Can we throw a checked exception? 
 * 	Yes you can throw both type of exceptions but in case of checked exceptions.
 * then you have to catch it using try catch or use throws keyword.
 */
