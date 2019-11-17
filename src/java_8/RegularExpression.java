package java_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

public class RegularExpression {

	public Boolean validate(String employeeID) throws IOException {

		String onlyDigits = "\\d+";

		if (employeeID.length() < 5 || employeeID.length() > 7)
			return false;

		if (employeeID.length() == 5)
			return employeeID.matches(onlyDigits);
		else if (employeeID.length() == 6) {

			List<Character> listt = Arrays.asList('K', 'X', 'U', 'S', 'C');

			Boolean cond1 = listt.contains(employeeID.charAt(0));

			Boolean cond2 = employeeID.substring(1).matches(onlyDigits);

			return (cond1 && cond2);
		} else if (employeeID.length() == 7) {
			Boolean cond1 = employeeID.substring(0, 2).equals("CX");

			Boolean cond2 = employeeID.substring(2).matches(onlyDigits);

			return (cond1 && cond2);
		}

		return false;

	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {

		RegularExpression rg = new RegularExpression();

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Class cls = Class.forName("anyName");
			
			Constructor cons = cls.getConstructor();
			
			cons.setAccessible(true);
			
			int t = Integer.parseInt(br.readLine());

			while (t > 0) {
				String s = br.readLine();

				System.out.println("Given expression is " + rg.validate(s));

				t = t - 1;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
