package internalization;

import java.util.Locale;

public class Locale_Impl {

	public static void main(String[] args) {
		
		
		Locale locale = new Locale("en","US");
		
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getScript());

	}

}
