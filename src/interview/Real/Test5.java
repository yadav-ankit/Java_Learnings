package interview.Real;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface LangFuntion {
	void callMe();
}

public class Test5 {

	public static void main(String[] args) {
		String st = "Hacking";
		LangFuntion lf = () -> System.out.println(st + "java");
		st = "ay";

		lf.callMe();

	}

}