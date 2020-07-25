package trickJavaQuestions;

public class Exceptionss {

	
	private static int play() {
		int x = 45;
		try {
			throw new RuntimeException();
		} finally {
			return x;
		}
	}

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
	
	private static int playTwo() {
		int x = 45;
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			x = 22;
			System.out.println(e.toString());
		} finally {
			return x;
		}
	}

	public static void main(String[] args) {

		System.out.println(play());
		System.out.println(playOne()());
		System.out.println(playTwo());
	}

}
