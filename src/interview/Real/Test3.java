package interview.Real;

public class Test3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "cc");

		System.out.println(sb);
	}

}