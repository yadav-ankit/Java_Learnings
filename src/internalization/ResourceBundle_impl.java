package internalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_impl {

	public static void main(String[] args) {
		ResourceBundle bundle =  ResourceBundle.getBundle("MessageBundle",Locale.US);
		
		System.out.println("Message in " + Locale.US + ":" + bundle.getString("gaali"));
	}

}
