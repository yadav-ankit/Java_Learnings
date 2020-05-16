package exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionLearn extends RuntimeException implements Cloneable {

	private int val;

	public int getVal() {
		return this.val;
	}

	public void play() throws InterruptedException, CloneNotSupportedException {

		try {
			test();
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		}

	}

	public static void test() throws NullPointerException, InterruptedException, CloneNotSupportedException {
		ExceptionLearn ex = new ExceptionLearn();

		ex.val = 34;

		// ex.wait();

		ExceptionLearn ey = (ExceptionLearn) ex.clone();

		// ex = null;
		System.out.println(ey.getVal());
	}

	private static boolean fun(boolean cond1, boolean cond2) {

		/*
		 * if (!checkIfComponentInformationReceived(omOrderActionImpl.getorderUnitId(),
		 * accessoriesComponent, Consts.DEVICE_IMEI1) ||
		 * !checkIfComponentInformationReceived(omOrderActionImpl.getorderUnitId(),
		 * accessoriesComponent, Consts.DEVICE_IMEI2)) { return false; }
		 */

		return (cond1 && cond2);

	}

	private static boolean fun1(boolean cond1, boolean cond2) {

		/*
		 * if (!checkIfComponentInformationReceived(omOrderActionImpl.getorderUnitId(),
		 * accessoriesComponent, Consts.DEVICE_IMEI1) ||
		 * !checkIfComponentInformationReceived(omOrderActionImpl.getorderUnitId(),
		 * accessoriesComponent, Consts.DEVICE_IMEI2)) { return false; }
		 */

		if(!cond1 || !cond2) {
			return false;
		}

		return true;
	}

	private static void rewari(List<String> allComponents) {
		
		List<String> test = allComponents;
		
		test.add("Ankit");
		
		for(String s : test) {
			System.out.println(s);
		}
	}
	public static void main(String... args) throws NullPointerException, InterruptedException,
			CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// test();

		// ExceptionLearn ex =
		// (ExceptionLearn)Class.forName("exception.ExceptionLearn").newInstance();

		// throw new ExceptionLearn();
		
		UpdateEquipmentDetails updateEqq = new UpdateEquipmentDetails();
		rewari(updateEqq.getImeiAccessoryList());
	}

}

/*
 * You don't need to Throw Unchecked Exception...Only throw checked Exception
 * 
 */