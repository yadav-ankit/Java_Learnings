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
