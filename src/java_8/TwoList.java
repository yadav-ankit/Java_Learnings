package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;

public class TwoList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<String> assignedRoles = Arrays.asList("CRM_Retail Agent" , "CRM_Retail Supervisor","CRM_CDPU Agent",
				"CRM_CDPU Supervisor","CRM_IT Support Engineer");
		
		List<String> GLProles = Arrays.asList("CRM_Retail Agent" , "CRM_Retail Supervisor","CRM_CDPU Agent",
				"CRM_IT Support Engineer","CRM_CDPU Superviso");
		
	
	//	assignedRoles.retainAll(GLProles);
		
		List<Integer> assigned = asList(10, 20, 40, 50);
		List<Integer> glp = asList(1,2,3,4,5);
		
		List<Integer> common = assigned.stream().filter(glp::contains).collect(Collectors.toList());
		
		if (common.size()==0) {
			System.out.println("block the flow");
		}else {
			System.out.println("Chalne do");
		}
		
		
	}

}
