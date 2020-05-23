package collections;

import java.text.DecimalFormat;

/**
 * @author ankyadav
 *
 */
public class Players {

	public static void main(String... args) {
		/*
		// Castin Parent to Child XXXX Not Possible
		// Parent le kr aa rha hu...aur Child me cast kr rha hu .  XXX
		OmOrderAction or = new OmOrderAction();
		OmOrderActionImpl orderAct = (OmOrderActionImpl) or.getOrderAction();

		System.out.println(orderAct.isPrepaid());

		// Casting Child to Parent...
		// Child le kr aa rha hu..aur Parent me cast kr rha hu.
		OmOrderActionImpl orImpl = new OmOrderActionImpl();
		
		OmOrderAction orderActs =  orImpl.getOrderAction();
		System.out.println(orderActs.isPrepaid());
		*/
		System.out.println(getFormattedDoubleValue(9997.6675));
		
	}
	
	public static String getFormattedDoubleValue(double amount) {
		return String.valueOf(new DecimalFormat("0.00").format(amount));
	}
}

class OmOrderAction {

	OmOrderAction getOrderAction() {
		return this;
	}

	public boolean isPrepaid() {
		return true;
	}
}

class OmOrderActionPHD extends OmOrderAction {

}

class OmOrderActionImpl extends OmOrderActionPHD {

	OmOrderActionImpl getOrderAction() {
		return this;
	}

	public boolean isPrepaid() {
		return false;
	}

}